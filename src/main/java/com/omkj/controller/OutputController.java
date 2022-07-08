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

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.omkj.entity.Fortunemaster;
import com.omkj.entity.Omikujii;
import com.omkj.entity.Unseiresult;
import com.omkj.repository.FortunemasterDao;
import com.omkj.repository.OmikujiiDao;
import com.omkj.repository.UnseiresultDao;
import com.omkj.service.FortunemasterService;
import com.omkj.service.OmikujiiService;
import com.omkj.service.UnseiresultService;

@Controller
public class OutputController {
	
	protected FortunemasterService fortunemasterService;
	
	protected OmikujiiService omikujiiService;
	
	protected UnseiresultService unseiresultService;
	
	protected FortunemasterDao fortunemasterDao;
	
	protected OmikujiiDao omikujiiDao;
	
	protected UnseiresultDao unseiresultDao;
	
	protected HttpServletRequest request;
	
	private static final String path="/omkj/csvomkj.csv";

	@PostMapping("/output/")
	public String output() throws IOException {
		
		String birthday = request.getParameter("birthday");
		
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		Calendar today = Calendar.getInstance();
		String todayString = df.format(today.getTime());
		
		BufferedReader br = null;
		List<Fortunemaster> fortuneList = fortunemasterService.getSelectSQLfromFortunemaster();
		
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
		
		int cnt = omikujiiService.countSQLfromOmikujii();
		
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
		
		List<Unseiresult> omkjid = unseiresultService.getcompareSQLfromUnseiresult(todayString, birthday);
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
		
		List<Omikujii> omkjgetcode = omikujiiService.getresultSQLfromOmikujii(omikujiID);
		
		Unseiresult result = new Unseiresult();
		
		
		
		return "/output/output";
	}
}
