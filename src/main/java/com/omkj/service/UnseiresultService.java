package com.omkj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.omkj.entity.Unseiresult;

/**
 * {@link Unseiresult}のサービスインタフェースです。
 * 
 * @author h_kim
 * @version 1.0
 */
@Service
public interface UnseiresultService {

	/**
	 * unseiresultテーブルにアクセスするメソッド
	 * @param todayString 今日の日付
	 * @param birthday 誕生日
	 * @return SQL文の結果
	 */
	public List<Unseiresult> getcompareSQLfromUnseiresult(String todayString, String birthday);
	
	/**
	 * unseiresultテーブルにアクセスするメソッド
	 * @param checkdate 何年前の日付
	 * @param birthday 誕生日
	 * @return SQL文の結果
	 */
	public List<Unseiresult> gethalfyearSQLfromUnseiresult(String checkdate, String birthday);
}
