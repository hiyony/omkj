package com.omkj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.omkj.dao.PostinfoDao;
import com.omkj.entity.Postinfo;

@Component
public class PostinfoServiceImpl implements PostinfoService{
	
	@Autowired
	private PostinfoDao postinfoDao;
	
	public List<Postinfo> getresultSQLfromPinfo(String zcode){
		return postinfoDao.getresultSQLfromPinfo(zcode);
	}
}
