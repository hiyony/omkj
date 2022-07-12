package com.omkj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.omkj.dao.UnseiresultDao;
import com.omkj.entity.Unseiresult;

@Component
public class UnseiresultServiceImpl implements UnseiresultService{

	@Autowired
	private UnseiresultDao unseiresultDao;
	
	public List<Unseiresult> getcompareSQLfromUnseiresult(String todayString, String birthday){
		return unseiresultDao.getcompareSQLfromUnseiresult(todayString, birthday);
	}
	
	public List<Unseiresult> gethalfyearSQLfromUnseiresult(String checkdate, String birthday){
		return unseiresultDao.gethalfyearSQLfromUnseiresult(checkdate, birthday);
	}
}
