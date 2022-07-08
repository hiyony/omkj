package com.omkj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omkj.entity.Fortunemaster;
import com.omkj.repository.FortunemasterDao;

@Service
public class FortunemasterServiceImpl implements FortunemasterService{

	@Autowired
	FortunemasterDao fortunemasterDao;
	
	public List<Fortunemaster> getSelectSQLfromFortunemaster(){
		return fortunemasterDao.getSelectSQLfromFortunemaster();
	}
}
