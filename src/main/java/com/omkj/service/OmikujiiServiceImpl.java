package com.omkj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omkj.entity.Omikujii;
import com.omkj.repository.OmikujiiDao;

@Service
public class OmikujiiServiceImpl implements OmikujiiService{

	@Autowired
	OmikujiiDao omikujiiDao;
	
	public int countSQLfromOmikujii() {
		return omikujiiDao.countSQLfromOmikujii();
	}
	
	public List<Omikujii> getresultSQLfromOmikujii(String omikujiID) {
		return omikujiiDao.getresultSQLfromOmikujii(omikujiID);
	}
	
}
