package com.omkj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.omkj.entity.Postinfo;
import com.omkj.service.PostinfoService;

@Controller
public class PostinfoController {
	
	@Autowired
	PostinfoService postinfoService;
	
	@RequestMapping(value="postinfo", method=RequestMethod.GET)
	public List<Postinfo> getresultSQLfromPinfo(String zcode){
		return postinfoService.getresultSQLfromPinfo(zcode);
	}
}
