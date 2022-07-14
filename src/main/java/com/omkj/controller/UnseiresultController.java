package com.omkj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.omkj.entity.Unseiresult;
import com.omkj.service.UnseiresultService;

/**
 * {@link Unseiresult}のコントローラークラスです。
 * 
 * @author h_kim
 * @version 1.0
 */
@Controller
public class UnseiresultController {

	/** Serviceインタフェース */
	@Autowired
	UnseiresultService unseiresultService;
	
	/**
	 * ウェーブのリクエストを処理するためにサービスを呼び出す
	 * @param todayString 今日の日付
	 * @param birthday 誕生日
	 * @return サービスのメソッド
	 */
	@RequestMapping(value="uresult", method=RequestMethod.GET)
	public List<Unseiresult> getcompareSQLfromUnseiresult(String todayString, String birthday){
		return unseiresultService.getcompareSQLfromUnseiresult(todayString, birthday);
	}
	
	/**
	 * ウェーブのリクエストを処理するためにサービスを呼び出す
	 * @param checkdate 半年前の日付
	 * @param birthday 誕生日
	 * @return サービスのメソッド
	 */
	@RequestMapping(value="halfresult", method=RequestMethod.GET)
	public List<Unseiresult> gethalfyearSQLfromUnseiresult(String checkdate, String birthday){
		return unseiresultService.gethalfyearSQLfromUnseiresult(checkdate, birthday);
	}
}
