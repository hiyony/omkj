package com.omkj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.omkj.entity.OmikujiiSave;
import com.omkj.entity.PercentSave;
import com.omkj.service.OmikujiiService;

@Controller
@RequestMapping(value="omikujii", method=RequestMethod.GET)
public class OmikujiiController {

	@Autowired
	OmikujiiService omikujiiService;
	
	@RequestMapping(value="/1")
	public int countSQLfromOmikujii() {
		return omikujiiService.countSQLfromOmikujii();
	}
	
	@RequestMapping(value="/2")
	public List<OmikujiiSave> getresultSQLfromOmikujii(String omikujiID){
		return omikujiiService.getresultSQLfromOmikujii(omikujiID);
	}
	
	@RequestMapping(value="/3")
	public List<PercentSave> getPercentResultList(String birthday){
		return omikujiiService.getPercentResultList(birthday);
	}
}
