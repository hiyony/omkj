package com.omkj.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.omkj.entity.Postinfo;
import com.omkj.entity.dto.GetzipcodeDto;
import com.omkj.service.PostinfoServiceImpl;

/**
 * 住所から郵便番号取得コントローラークラスです。
 * 
 * @author h_kim
 * @version 1.0
 */
@RestController
public class GetzipcodeController {

	/** サービス処理クラス */
	@Autowired
	PostinfoServiceImpl postinfoServiceImpl;
	
	/**
	 * 入力された住所から郵便番号の結果を検索しリストを取得する。
	 * 入力パラメーターはrequestから取得する。
	 * 結果が一件か複数件かによって検索するための文字列の長さを調節し処理する。
	 * @param request リクエスト
	 * @param response リスポンス
	 * @throws IOException
	 */
	@RequestMapping(value="/getzipcode", method=RequestMethod.POST)
	@ResponseBody
	public void getzipcode(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String address = request.getParameter("address");
		
		String repaddress1 = address.replaceAll("[都道府県]", "#");
		int index1 = repaddress1.indexOf("#", 2);
		if(index1 == -1) {
			return;
		}
		String address1 = address.substring(0, index1+1);
		
		repaddress1 = address.replaceAll("[市区町村]", "@");
		int index2 = repaddress1.indexOf("@", address1.length()+1);
		if(index2 == -1 || (index2 + 3 >= address.length())) {
			index2 = address.length();
		} else {
			index2 += 3;
		}
		
		String repaddress2 = address.replaceAll("[ヶが]", "ケ");
		repaddress2 = address.replaceAll("[ノ之乃]", "の");
		String replaceaddress = repaddress2.substring(0, index2);
		
		List<Postinfo> zcode = postinfoServiceImpl.getzipcodeSQLfromPinfo(address1, replaceaddress);
		
		Map<String, String> beforeMap = new HashMap<String, String>();
		Map<String, String> nowMap = new HashMap<String, String>();
		
		while(true) {
			Iterator<Postinfo> iterator = zcode.iterator();
			
			while(iterator.hasNext()) {
				Postinfo postinfo = (Postinfo) iterator.next();
				nowMap.put(postinfo.zipcode, postinfo.homeaddress);
			}
			
			if(nowMap.size() == 1) {
				break;
			} else if(nowMap.size() > 1) {
				index2 = index2 + 1;
				if(address.length() == replaceaddress.length()) {
					break;
				}
				replaceaddress = repaddress2.substring(0, index2);
				
				beforeMap.clear();
				beforeMap.putAll(nowMap);
				nowMap.clear();
			} else if(nowMap.size() == 0) {
				replaceaddress = replaceaddress.substring(0, replaceaddress.length()-1);
				if(replaceaddress.length() <= address1.length()) {
					break;
				}
				if(beforeMap.size() > 0) {
					nowMap.clear();
					nowMap.putAll(beforeMap);
					beforeMap.clear();
					break;
				}
			}
		}
		
		JSONObject json = new JSONObject(nowMap);
		
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter writer = response.getWriter();
		writer.print(json);
		
		String zipcode = null;
		String totaladdress = null;
		GetzipcodeDto dto = new GetzipcodeDto();
		List <GetzipcodeDto> list = new ArrayList <GetzipcodeDto>();
		
		for(Map.Entry<String, String> entry : nowMap.entrySet()){
			zipcode = entry.getKey();
			totaladdress = entry.getValue();
			dto.setZipcode(zipcode);
			dto.setHomeaddress(totaladdress);
			list.add(dto);
		}
		
		request.setAttribute("list", list);
	}
}
