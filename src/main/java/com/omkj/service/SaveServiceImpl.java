package com.omkj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.omkj.dao.SaveDao;
import com.omkj.entity.Save;

/**
 * {@link Save}のサービス処理クラスです。
 * 
 * @author h_kim
 * @version 1.0
 */
@Component
public class SaveServiceImpl implements SaveService{
	
	/** Dao */
	@Autowired
	SaveDao saveDao;
	
	/**
	 * saveサービスインタフェースから相続されたメソッドを使い、結果を受け取ります。
	 * データベースに接近するDaoを利用して結果値を受け取る
	 */
	@Override
	public List<Save> getresultjSQLfromSave() {
		return saveDao.getresultjSQLfromSave();
	}

}
