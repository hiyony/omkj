package com.omkj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.omkj.entity.Postinfo;

/**
 * {@link Postinfo}のサービスインタフェースです。
 * 
 * @author h_kim
 * @version 1.0
 */
@Service
public interface PostinfoService {
	
	/**
	 * postinfoテーブルにアクセスするメソッド
	 * @param zcode 郵便番号
	 * @return SQL文の結果
	 */
	public List<Postinfo> getresultSQLfromPinfo(String zcode);
	
	/**
	 * postinfoテーブルにアクセスするメソッド
	 * @param homeaddress 住所
	 * @param replaceaddress 区別された住所
	 * @return SQL文の結果
	 */
	public List<Postinfo> getzipcodeSQLfromPinfo(String homeaddress, String replaceaddress);
}
