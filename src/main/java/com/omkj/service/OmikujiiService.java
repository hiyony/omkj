package com.omkj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.omkj.entity.OmikujiiSave;

@Service
public interface OmikujiiService {
	
	public int countSQLfromOmikujii();
	public List<OmikujiiSave> getresultSQLfromOmikujii(String omikujiID);
}
