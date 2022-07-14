package com.omkj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.omkj.dao.FortunemasterDao;
import com.omkj.entity.Fortunemaster;

/**
 * {@link Fortunemaster}のサービス処理クラスです。
 * 
 * @author h_kim
 * @version 1.0
 */

@Component
public class FortunemasterServiceImpl implements FortunemasterService{

	/** Dao */
	@Autowired
	private FortunemasterDao fortunemasterDao;
	
	/**
	 * fortunemasterサービスインタフェースから相続されたメソッドを使い、結果を受け取ります。
	 * データベースに接近するDaoを利用して結果値を受け取る
	 */
	public List<Fortunemaster> getSelectSQLfromFortunemaster(){
		return fortunemasterDao.getSelectSQLfromFortunemaster();
	}
}
