package com.omkj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.omkj.entity.Omikujii;
import com.omkj.entity.OmikujiiSave;
import com.omkj.entity.PercentSave;
import com.omkj.service.OmikujiiService;

/**
 * {@link Omikujii}のコントローラークラスです。
 * 
 * @author h_kim
 * @version 1.0
 */

@Controller
@RequestMapping(value="omikujii", method=RequestMethod.GET)
public class OmikujiiController {

	/** Serviceインタフェース */
	@Autowired
	OmikujiiService omikujiiService;
	
	/**
	 * ウェーブのリクエストを処理するためにサービスを呼び出す
	 * @return サービスのメソッド
	 */
	@RequestMapping(value="/1")
	public int countSQLfromOmikujii() {
		return omikujiiService.countSQLfromOmikujii();
	}
	
	/**
	 * ウェーブのリクエストを処理するためにサービスを呼び出す
	 * @param omikujiID おみくじID
	 * @return サービスのメソッド
	 */
	@RequestMapping(value="/2")
	public List<OmikujiiSave> getresultSQLfromOmikujii(String omikujiID){
		return omikujiiService.getresultSQLfromOmikujii(omikujiID);
	}
	
	/**
	 * ウェーブのリクエストを処理するためにサービスを呼び出す
	 * @param birthday 誕生日
	 * @return サービスのメソッド
	 */
	@RequestMapping(value="/3")
	public List<PercentSave> getPercentResultList(String birthday){
		return omikujiiService.getPercentResultList(birthday);
	}
}
