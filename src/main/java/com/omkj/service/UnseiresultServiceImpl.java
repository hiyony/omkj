package com.omkj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.omkj.dao.UnseiresultDao;
import com.omkj.entity.Unseiresult;

/**
 * {@link Unseiresult}のサービス処理クラスです。
 * 
 * @author h_kim
 * @version 1.0
 */
@Component
public class UnseiresultServiceImpl implements UnseiresultService{

	/* Dao */
	@Autowired
	private UnseiresultDao unseiresultDao;
	
	/**
	 * unseiresultサービスインタフェースから相続されたメソッドを使い、結果を受け取ります。
	 * データベースに接近するDaoを利用して結果値を受け取る
	 */
	public List<Unseiresult> getcompareSQLfromUnseiresult(String todayString, String birthday){
		return unseiresultDao.getcompareSQLfromUnseiresult(todayString, birthday);
	}
	
	/**
	 * unseiresultサービスインタフェースから相続されたメソッドを使い、結果を受け取ります。
	 * データベースに接近するDaoを利用して結果値を受け取る
	 */
	public List<Unseiresult> gethalfyearSQLfromUnseiresult(String checkdate, String birthday){
		return unseiresultDao.gethalfyearSQLfromUnseiresult(checkdate, birthday);
	}
}
