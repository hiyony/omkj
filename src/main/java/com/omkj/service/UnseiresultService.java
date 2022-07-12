package com.omkj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.omkj.entity.Unseiresult;

@Service
public interface UnseiresultService {

	public List<Unseiresult> getcompareSQLfromUnseiresult(String todayString, String birthday);
	
	public List<Unseiresult> gethalfyearSQLfromUnseiresult(String checkdate, String birthday);
}
