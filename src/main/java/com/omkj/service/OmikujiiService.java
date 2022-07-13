package com.omkj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.omkj.entity.OmikujiiSave;
import com.omkj.entity.PercentSave;

@Service
public interface OmikujiiService {
	
	public int countSQLfromOmikujii();
	public List<OmikujiiSave> getresultSQLfromOmikujii(String omikujiID);
	public List<PercentSave> getPercentResultList(String birthday);
}
