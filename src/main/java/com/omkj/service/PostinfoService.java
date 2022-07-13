package com.omkj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.omkj.entity.Postinfo;

@Service
public interface PostinfoService {
	
	public List<Postinfo> getresultSQLfromPinfo(String zcode);
}
