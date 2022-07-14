package com.omkj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.omkj.dao.PostinfoDao;
import com.omkj.entity.Postinfo;

/**
 * {@link Postinfo}のサービス処理クラスです。
 * 
 * @author h_kim
 * @version 1.0
 */
@Component
public class PostinfoServiceImpl implements PostinfoService{
	
	/** Dao */
	@Autowired
	private PostinfoDao postinfoDao;
	
	/**
	 * postinfoサービスインタフェースから相続されたメソッドを使い、結果を受け取ります。
	 * データベースに接近するDaoを利用して結果値を受け取る
	 */
	public List<Postinfo> getresultSQLfromPinfo(String zcode){
		return postinfoDao.getresultSQLfromPinfo(zcode);
	}

	/**
	 * postinfoサービスインタフェースから相続されたメソッドを使い、結果を受け取ります。
	 * データベースに接近するDaoを利用して結果値を受け取る
	 */
	@Override
	public List<Postinfo> getzipcodeSQLfromPinfo(String homeaddress, String replaceaddress) {
		return postinfoDao.getzipcodeSQLfromPinfo(homeaddress, replaceaddress);
	}
}
