package com.omkj.service;

import java.util.List;

import com.omkj.entity.OmikujiiSave;

public interface OmikujiiService {
	
	public int countSQLfromOmikujii();
	public List<OmikujiiSave> getresultSQLfromOmikujii(String omikujiID);
}
