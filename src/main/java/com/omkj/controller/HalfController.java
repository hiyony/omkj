package com.omkj.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.omkj.entity.Unseiresult;
import com.omkj.entity.dto.HalfDto;
import com.omkj.service.UnseiresultServiceImpl;

/**
 * 半年分の結果取得コントローラークラスです。
 * 
 * @author h_kim
 * @version 1.0
 */
@Controller
public class HalfController {

	/** サービス処理クラス */
	@Autowired
	UnseiresultServiceImpl unseiresultServiceImpl;
	
	/**
	 * 半年前の結果から今日の結果まで検索しリストを取得する。
	 * 入力パラメーターはrequestから取得をする (yyyyMMdd方式)
	 * 　入力パラメーターの日付から過去半年は自動的に計算し処理する。
	 * 
	 * @param model モデル
	 * @param request レクエスと
	 * @return html画面
	 */
	@RequestMapping(value="/half", method=RequestMethod.POST)
	public String half(Model model, HttpServletRequest request) {
		
//		HttpSession session = request.getSession();
//		String birthday = (String) session.getAttribute("birthday");

		String birthday = request.getParameter("birthday");
		
		Calendar cal = new GregorianCalendar();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
		
		cal.add(Calendar.MONTH, -6);
		String checkdate = simpleDateFormat.format(cal.getTime());
		
		List<HalfDto> list = new ArrayList<HalfDto>();
		
		List<Unseiresult> halfresult = unseiresultServiceImpl.gethalfyearSQLfromUnseiresult(checkdate, birthday);
		Iterator<Unseiresult> iterator = halfresult.iterator();
		
		while(iterator.hasNext()) {
			Unseiresult unseiresult = (Unseiresult) iterator.next();
			HalfDto halfdto = new HalfDto();
			
			halfdto.setUranaidate(unseiresult.uranaidate);
			halfdto.setBirthday(unseiresult.birthday);
			halfdto.setOmikujicode(unseiresult.omikujicode);
			halfdto.setRenewalwriter(unseiresult.renewalwriter);
			halfdto.setRenewaldate(unseiresult.renewaldate);
			halfdto.setUnseiwriter(unseiresult.unseiwriter);
			halfdto.setUnseiwritedate(unseiresult.unseiwritedate);
			
			list.add(halfdto);
		}
		
		model.addAttribute("list", list);
		
		return "half/half";
	}
}
