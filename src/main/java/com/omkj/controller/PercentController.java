package com.omkj.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.omkj.entity.dto.PercentDto;

@Controller
public class PercentController {

	@RequestMapping(value="/percent", method=RequestMethod.GET)
	public String percent(Model model, HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		String birthday = (String) session.getAttribute("bday");
		
		List<PercentDto> list = new ArrayList<PercentDto>();
		
		return "percent/percent";
		
	}
}
