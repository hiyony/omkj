package com.omkj.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.omkj.entity.Fortunemaster;
import com.omkj.repository.dao.FortunemasterDao;

@Component
public class FortunemasterServiceImpl implements FortunemasterService{

	FortunemasterDao fortunemasterDao;
	
	public List<Fortunemaster> getSelectSQLfromFortunemaster(){
		return fortunemasterDao.getSelectSQLfromFortunemaster();
	}
}
