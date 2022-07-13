package com.omkj.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.omkj.entity.PercentSave;
import com.omkj.entity.dto.PercentDto;
import com.omkj.service.OmikujiiServiceImpl;

@RestController
public class PercentController {
	
	@Autowired
	OmikujiiServiceImpl omikujiiServiceImpl;

	@RequestMapping(value="/percent", method=RequestMethod.POST)
	@ResponseBody
	public List<PercentDto> percent(Model model, HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String birthday = request.getParameter("birthday");
		
		List<PercentDto> list = new ArrayList<PercentDto>();
		
		List<PercentSave> percentresult = omikujiiServiceImpl.getPercentResultList(birthday);
		Iterator<PercentSave> iterator = percentresult.iterator();
		
		while(iterator.hasNext()) {
			PercentSave percentSave = (PercentSave) iterator.next();
			PercentDto percentDto = new PercentDto();
			
			if(percentSave.fortunecount == null && percentSave.totalpercent == null) {
				percentSave.fortunecount = 0;
				percentSave.totalpercent = 0;
			}
			
			percentDto.setFortunename(percentSave.fortunename);
			percentDto.setFortunecount(percentSave.fortunecount);
			percentDto.setTotalpercent(percentSave.totalpercent);
			list.add(percentDto);
			
		}
		
		return list;
	
	}
}
