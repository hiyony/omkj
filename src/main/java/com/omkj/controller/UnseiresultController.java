package com.omkj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.omkj.entity.Unseiresult;
import com.omkj.service.UnseiresultService;

@Controller
public class UnseiresultController {

	@Autowired
	UnseiresultService unseiresultService;
	
	@RequestMapping(value="uresult", method=RequestMethod.GET)
	public List<Unseiresult> getcompareSQLfromUnseiresult(String todayString, String birthday){
		return unseiresultService.getcompareSQLfromUnseiresult(todayString, birthday);
	}
	
	@RequestMapping(value="halfresult", method=RequestMethod.GET)
	public List<Unseiresult> gethalfyearSQLfromUnseiresult(String checkdate, String birthday){
		return unseiresultService.gethalfyearSQLfromUnseiresult(checkdate, birthday);
	}
}
