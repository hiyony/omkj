package com.omkj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.omkj.entity.Omikujii;
import com.omkj.entity.OmikujiiSave;
import com.omkj.entity.PercentSave;

/**
 * {@link Omikujii}のサービスインタフェースです。
 * 
 * @author h_kim
 * @version 1.0
 */

@Service
public interface OmikujiiService {
	
	/**
	 * omikujiiテーブルにアクセスするメソッド
	 * @return SQL文の結果
	 */
	public int countSQLfromOmikujii();
	
	/**
	 * omikujiiテーブルにアクセスするメソッド
	 * @param omikujiID おみくじID
	 * @return SQL文の結果
	 */
	public List<OmikujiiSave> getresultSQLfromOmikujii(String omikujiID);
	
	/**
	 * omikujiiテーブルにアクセスするメソッド
	 * @param birthday 誕生日
	 * @return SQL文の結果
	 */
	public List<PercentSave> getPercentResultList(String birthday);
}
