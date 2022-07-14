package com.omkj.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.omkj.entity.PercentSave;
import com.omkj.entity.dto.PercentDto;
import com.omkj.service.OmikujiiServiceImpl;

/**
 * 今までのおみくじ割合取得コントローラークラス。
 * クラス、画面からの要求を制御するコントローラークラス。
 * 今までのおみくじ結果の割合を取得します。
 * 
 * @author h_kim
 * @version 1.0
 */
@RestController
public class PercentController {

	/** サービス処理クラス */
	@Autowired
	OmikujiiServiceImpl omikujiiServiceImpl;

	/**
	 * 誕生日の今までのおみくじ割合と数を検索しリストを取得する。
	 * 入力パラメーターはrequestから取得する
	 * 入力された誕生日のおみくじ結果に関して項目それぞれの数と割合を自動的に計算し処理する。
	 * 
	 * @param model モデル
	 * @param request リクエスト
	 * @param response リスポンス
	 * @return 結果リスト
	 * @throws IOException
	 */
	@RequestMapping(value="/percent", method=RequestMethod.POST)
	@ResponseBody
	public List<PercentDto> percent(Model model, HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String birthday = request.getParameter("birthday");
		
		List<PercentDto> list = new ArrayList<PercentDto>();
		
		List<PercentSave> percentresult = omikujiiServiceImpl.getPercentResultList(birthday);
		Iterator<PercentSave> iterator = percentresult.iterator();
		
		while(iterator.hasNext()) {
			PercentSave percentSave = (PercentSave) iterator.next();
			PercentDto percentDto = new PercentDto();
			
			if(percentSave.fortunecount == null && percentSave.totalpercent == null) {
				percentSave.fortunecount = 0;
				percentSave.totalpercent = 0;
			}
			
			percentDto.setFortunename(percentSave.fortunename);
			percentDto.setFortunecount(percentSave.fortunecount);
			percentDto.setTotalpercent(percentSave.totalpercent);
			list.add(percentDto);
			
		}
		
		return list;
	
	}
}
