package com.omkj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.omkj.entity.Postinfo;
import com.omkj.service.PostinfoService;

/**
 * {@link Postinfo}のコントローラークラスです。
 * 
 * @author h_kim
 * @version 1.0
 */

@Controller
public class PostinfoController {
	
	/** Serviceインタフェース */
	@Autowired
	PostinfoService postinfoService;
	
	/**
	 * ウェーブのリクエストを処理するためにサービスを呼び出す
	 * @param zcode 郵便番号
	 * @return サービスのメソッド
	 */
	@RequestMapping(value="postinfo1", method=RequestMethod.GET)
	public List<Postinfo> getresultSQLfromPinfo(String zcode){
		return postinfoService.getresultSQLfromPinfo(zcode);
	}
	
	/**
	 * ウェーブのリクエストを処理するためにサービスを呼び出す
	 * @param homeaddress 住所
	 * @param replaceaddress 区別された住所
	 * @return サービスのメソッド
	 */
	@RequestMapping(value="postinfo2", method=RequestMethod.GET)
	public List<Postinfo> getzipcodeSQLfromPinfo(String homeaddress, String replaceaddress){
		return postinfoService.getzipcodeSQLfromPinfo(homeaddress, replaceaddress);
	}
}
