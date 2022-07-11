package com.omkj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.omkj.entity.Unseiresult;
import com.omkj.repository.dao.UnseiresultDao;

@Service
public class UnseiresultServiceImpl implements UnseiresultService{

	
	UnseiresultDao unseiresultDao;
	
	public List<Unseiresult> getcompareSQLfromUnseiresult(String todayString, String birthday){
		return unseiresultDao.getcompareSQLfromUnseiresult(todayString, birthday);
	}
}
