package com.omkj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.omkj.entity.Fortunemaster;
import com.omkj.service.FortunemasterService;

@Controller
public class FortunemasterController {
	
	@Autowired
	FortunemasterService fortunemasterService;
	
	@RequestMapping(value="fortune", method=RequestMethod.GET)
	public List<Fortunemaster> getSelectSQLfromFortunemaster(){
		return fortunemasterService.getSelectSQLfromFortunemaster();
	}
}
