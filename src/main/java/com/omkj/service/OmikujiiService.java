package com.omkj.service;

import java.util.List;

import com.omkj.entity.Omikujii;

public interface OmikujiiService {
	
	public int countSQLfromOmikujii();
	public List<Omikujii> getresultSQLfromOmikujii(String omikujiID);
}
