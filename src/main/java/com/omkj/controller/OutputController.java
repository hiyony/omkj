package com.omkj.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.omkj.dao.FortunemasterDao;
import com.omkj.dao.OmikujiiDao;
import com.omkj.dao.UnseiresultDao;
import com.omkj.entity.Fortunemaster;
import com.omkj.entity.Omikujii;
import com.omkj.entity.OmikujiiSave;
import com.omkj.entity.Unseiresult;
import com.omkj.entity.dto.OmikujiiDto;
import com.omkj.service.FortunemasterServiceImpl;
import com.omkj.service.OmikujiiServiceImpl;
import com.omkj.service.UnseiresultServiceImpl;

/**
 * おみくじ結果取得コントローラークラス。
 * クラス、画面からの要求を制御するコントローラークラス。
 * おみくじデータベースから入力された誕生日のおみくじ結果を取得します。
 * 
 * @author h_kim
 * @version 1.0
 */
@Controller
public class OutputController {

	/** サービス処理クラス */
	@Autowired
	FortunemasterServiceImpl fortunemasterServiceImpl;

	/** サービス処理クラス */
	@Autowired
	OmikujiiServiceImpl omikujiiServiceImpl;

	/** サービス処理クラス */
	@Autowired
	UnseiresultServiceImpl unseiresultServiceImpl;
	
	/** Dao */
	@Autowired
	FortunemasterDao fortunemasterDao;
	
	/** Dao */
	@Autowired
	OmikujiiDao omikujiiDao;
	
	/** Dao */
	@Autowired
	UnseiresultDao unseiresultDao;

	/** おみくじのCSVファイル */
	private static final String path="/omkj/csvomkj.csv";

	/**
	 * 入力されたお誕生日でおみくじの結果をランダムで取得する。
	 * 入力パラメーターはsessionから取得する(yyyyMMdd方式)
	 * 過去の結果の中に同じ誕生日と日付の結果がある場合、これを取得する。
	 * 新しい日付と誕生日の場合、ランダムで結果を取得する。
	 * 
	 * @param model モデル
	 * @param request リクエスト
	 * @return html画面
	 * @throws IOException
	 */
	@RequestMapping(value="/output", method=RequestMethod.GET)
	public String output(Model model, HttpServletRequest request) throws IOException {
		
		HttpSession session = request.getSession();
		String birthday = (String) session.getAttribute("bday");
		
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		Calendar today = Calendar.getInstance();
		String todayString = df.format(today.getTime());
		
		BufferedReader br = null;
		List<Fortunemaster> fortuneList = fortunemasterServiceImpl.getSelectSQLfromFortunemaster();
		
		Map<String, String> unseiMap = new HashMap<String, String>();
		Iterator<Fortunemaster> iterator = fortuneList.iterator();
		
		while(iterator.hasNext()) {
			Fortunemaster fortunemaster = (Fortunemaster) iterator.next();
			unseiMap.put(fortunemaster.unseiname, fortunemaster.unseicode);
		}
		
		if(unseiMap.isEmpty()){
			String line;
			br = new BufferedReader(new FileReader(path));
			br.readLine();
			
			while((line = br.readLine()) != null) {
				String [] values = line.split(",");
				if(!unseiMap.keySet().contains(values[1])) {
					unseiMap.put(values[1], values[0]);
				}
			}
			
			for(Map.Entry<String, String> entry : unseiMap.entrySet()) {
				Fortunemaster fortunemaster = new Fortunemaster();
				fortunemaster.unseiname = entry.getKey();
				fortunemaster.unseicode = entry.getValue();
				fortunemaster.renewalwriter = "ヒヨ";
				fortunemaster.renewaldate = todayString;
				fortunemaster.unseiwriter = "ヒヨ";
				fortunemaster.unseiwritedate = todayString;
				
				fortunemasterDao.insertFortune(fortunemaster);
			}
		}	
		
		int cnt = omikujiiServiceImpl.countSQLfromOmikujii();
		
		if(cnt == 0) {
			String line;
			
			br = new BufferedReader(new FileReader(path));
			br.readLine();
			
			while((line=br.readLine()) != null) {
				Omikujii omikujii = new Omikujii();
				
				omikujii.omikujicode = Integer.toString(cnt + 1);
				String [] values = line.split(",");
				omikujii.unseicode = unseiMap.get(values[1]);
				omikujii.negaigoto = values[2];
				omikujii.akinai = values[3];
				omikujii.gakumon = values[4];
				omikujii.renewalwriter = "ヒヨ";
				omikujii.renewaldate = todayString;
				omikujii.unseiwriter = "ヒヨ";
				omikujii.unseiwritedate = todayString;
				cnt++;
				
				omikujiiDao.insertOmikuji(omikujii);
			}
		}
		
		List<Unseiresult> omkjid = unseiresultServiceImpl.getcompareSQLfromUnseiresult(todayString, birthday);
		Iterator<Unseiresult> it = omkjid.iterator();
		String omikujiID = null;
		
		while(it.hasNext()) {
			Unseiresult unseiresult = (Unseiresult) it.next();
			omikujiID = unseiresult.omikujicode;
		}
		
		if(omikujiID == null) {
			int rannum = new Random().nextInt(cnt) + 1;
			omikujiID = String.valueOf(rannum);
		}
		
		List<OmikujiiSave> omkjgetcode = omikujiiServiceImpl.getresultSQLfromOmikujii(omikujiID);
		
		Unseiresult result = new Unseiresult();
		result.uranaidate = todayString;
		result.birthday = birthday;
		result.omikujicode = omikujiID;
		result.renewalwriter = "ヒヨン";
		result.renewaldate = todayString;
		result.unseiwriter = "ヒヨン";
		result.unseiwritedate = todayString;
		
		unseiresultDao.insertResult(result);
		
		OmikujiiDto omikujiiDto = new OmikujiiDto();
		for(OmikujiiSave omikujiiSave : omkjgetcode) {
			omikujiiDto.setOmikuji(omikujiiSave.getUnseiname());
			omikujiiDto.setNegaigoto(omikujiiSave.getNegaigoto());
			omikujiiDto.setAkinai(omikujiiSave.getAkinai());
			omikujiiDto.setGakumon(omikujiiSave.getGakumon());
		}
		
		String omkj = omikujiiDto.getOmikuji();
		String negaigoto = omikujiiDto.getNegaigoto();
		String akinai = omikujiiDto.getAkinai();
		String gakumon = omikujiiDto.getGakumon();
		
		model.addAttribute("birthday", birthday);
		model.addAttribute("omkj", omkj);
		model.addAttribute("negaigoto", negaigoto);
		model.addAttribute("akinai", akinai);
		model.addAttribute("gakumon", gakumon);
		
		return "output/output";
	}
}
