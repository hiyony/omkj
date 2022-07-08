package com.omkj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omkj.entity.Unseiresult;
import com.omkj.repository.UnseiresultDao;

@Service
public class UnseiresultServiceImpl implements UnseiresultService{

	@Autowired
	UnseiresultDao unseiresultDao;
	
	public List<Unseiresult> getcompareSQLfromUnseiresult(String todayString, String birthday){
		return unseiresultDao.getcompareSQLfromUnseiresult(todayString, birthday);
	}
}
