package com.omkj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.omkj.dao.FortunemasterDao;
import com.omkj.entity.Fortunemaster;

@Component
public class FortunemasterServiceImpl implements FortunemasterService{

	@Autowired
	private FortunemasterDao fortunemasterDao;
	
	public List<Fortunemaster> getSelectSQLfromFortunemaster(){
		return fortunemasterDao.getSelectSQLfromFortunemaster();
	}
}
