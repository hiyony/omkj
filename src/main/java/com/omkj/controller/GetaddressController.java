package com.omkj.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.omkj.entity.Postinfo;
import com.omkj.entity.dto.GetaddressDto;
import com.omkj.service.PostinfoServiceImpl;

@RestController
public class GetaddressController {
	
	@Autowired
	PostinfoServiceImpl postinfoServiceImpl;
	
	@RequestMapping(value="/getaddress", method=RequestMethod.POST)
	@ResponseBody
	public String getaddress(HttpServletRequest request, HttpServletResponse response) throws IOException{
			
		String zcode = request.getParameter("zcode");
		
		List<Postinfo> address = postinfoServiceImpl.getresultSQLfromPinfo(zcode);
		Iterator<Postinfo> iterator = address.iterator();
		
		String homeaddress = null;
		while(iterator.hasNext()) {
			Postinfo postinfo = (Postinfo) iterator.next();
			homeaddress = postinfo.homeaddress;
		}
		
		GetaddressDto getaddressDto = new GetaddressDto();
		getaddressDto.zipcode = zcode;
		getaddressDto.address = homeaddress;
		
		response.setContentType("application/text; charset=UTF-8");
		PrintWriter writer = response.getWriter();
		writer.print(getaddressDto.address);
		
		
		
		return null;
	}
}
