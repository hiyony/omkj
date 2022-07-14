package com.omkj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.omkj.entity.Fortunemaster;
import com.omkj.service.FortunemasterService;

/**
 * {@link Fortunemaster}のコントローラークラスです。
 * 
 * @author h_kim
 * @version 1.0
 */

@Controller
public class FortunemasterController {
	
	/** Serviceインタフェース */
	@Autowired
	FortunemasterService fortunemasterService;
	
	/**
	 * ウェーブのリクエストを処理するためにサービスを呼び出す
	 * @return サービスのメソッド
	 */
	@RequestMapping(value="fortune", method=RequestMethod.GET)
	public List<Fortunemaster> getSelectSQLfromFortunemaster(){
		return fortunemasterService.getSelectSQLfromFortunemaster();
	}
}
