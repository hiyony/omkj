package com.omkj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.omkj.dao.OmikujiiDao;
import com.omkj.entity.OmikujiiSave;
import com.omkj.entity.PercentSave;

@Component
public class OmikujiiServiceImpl implements OmikujiiService{

	@Autowired
	private OmikujiiDao omikujiiDao;
	
	public int countSQLfromOmikujii() {
		return omikujiiDao.countSQLfromOmikujii();
	}
	
	public List<OmikujiiSave> getresultSQLfromOmikujii(String omikujiID) {
		return omikujiiDao.getresultSQLfromOmikujii(omikujiID);
	}
	
	public List<PercentSave> getPercentResultList(String birthday) {
		return omikujiiDao.getPercentResultList(birthday);
	}
	
}
