package com.omkj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.omkj.entity.OmikujiiSave;
import com.omkj.repository.dao.OmikujiiDao;

@Service
public class OmikujiiServiceImpl implements OmikujiiService{

	
	OmikujiiDao omikujiiDao;
	
	public int countSQLfromOmikujii() {
		return omikujiiDao.countSQLfromOmikujii();
	}
	
	public List<OmikujiiSave> getresultSQLfromOmikujii(String omikujiID) {
		return omikujiiDao.getresultSQLfromOmikujii(omikujiID);
	}
	
}
