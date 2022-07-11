package com.omkj.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.omkj.entity.Fortunemaster;

@Service
@Transactional
public interface FortunemasterService {
	
	public List<Fortunemaster> getSelectSQLfromFortunemaster();
	
}
