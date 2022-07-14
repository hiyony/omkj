package com.omkj.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.omkj.dao.SaveDao;
import com.omkj.entity.Save;
import com.omkj.entity.dto.SaveDto;
import com.omkj.entity.dto.SavingDto;
import com.omkj.service.SaveServiceImpl;

/**
 * 個人情報保存コントローラークラス。
 * クラス、画面からの要求を制御するコントローラークラス。
 * 入力された名前、郵便番号、メールアドレスをデータベースに保存し出力します。
 * 
 * @author h_kim
 * @version 1.0
 */
@Controller
public class SavingController {

	/** サービス処理クラス */
	@Autowired
	SaveServiceImpl saveServiceImpl;
	
	/** Dao */
	@Autowired
	SaveDao saveDao;
	
	/**
	 * 名前、郵便番号、住所、メールアドレスをデータベースに保存してこのデータをリストで取得する。
	 * 入力パラメーターはrequestから取得をする
	 * 
	 * @param request リクエスト
	 * @return html画面
	 * @throws IOException
	 */
	@RequestMapping(value="/saving", method=RequestMethod.POST)
	public String save(HttpServletRequest request) throws IOException{
		
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String zipcode = request.getParameter("postnumber");
		String homeaddress = request.getParameter("homeaddress");
		String emailaddress = request.getParameter("emailaddress");
		
		List <SaveDto> savelist = new ArrayList <SaveDto> ();
		
		Save save = new Save();
		save.name = name;
		save.zipcode = zipcode;
		save.homeaddress = homeaddress;
		save.emailaddress = emailaddress;
		
		SaveDto saveDto = new SaveDto();
		saveDto.setName(name);
		saveDto.setZipcode(zipcode);
		saveDto.setHomeaddress(homeaddress);
		saveDto.setEmailaddress(emailaddress);
		
		savelist.add(saveDto);
		
		saveDao.insertSavings(save);
		
		List <SavingDto> list = new ArrayList<SavingDto>();
		List <Save> result = saveServiceImpl.getresultjSQLfromSave();
		Iterator <Save> iterator = result.iterator();
		
		while(iterator.hasNext()){
			Save savings = (Save) iterator.next();
			SavingDto sdto = new SavingDto();
			
			sdto.setName(savings.name);
			sdto.setZipcode(savings.zipcode);
			sdto.setHomeaddress(savings.homeaddress);
			sdto.setEmailaddress(savings.emailaddress);
			list.add(sdto);
		}
		
		
		request.setAttribute("list", list);
		
		return "save/save";
	}
}
