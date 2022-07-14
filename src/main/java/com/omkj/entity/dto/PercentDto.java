package com.omkj.entity.dto;

import lombok.NoArgsConstructor;

/**
 * データベースから受け取った内容を保存するDTOクラスです。
 * DTOクラス＝単純データ移送クラス。
 * 
 * @author h_kim
 * @version 1.0
 */
@NoArgsConstructor
public class PercentDto {

	/**　運勢コード */
	public String fortunecode;
	
	/** 運勢名　*/
	public String fortunename;
	
	/** 運勢数　*/
	public Integer fortunecount;
	
	/** 割合 */
	public Integer totalpercent;
	
	/**
	 * 運勢コードを受け取る。
	 * @return 運勢コード
	 */
	public String getFortunecode() {
		return fortunecode;
	}
	
	/**
	 * 運勢コードをセットする。
	 * @param fortunecode　運勢コード
	 */
	public void setFortunecode(String fortunecode) {
		this.fortunecode = fortunecode;
	}
	
	/**
	 * 運勢名を受け取る。
	 * @return 運勢名
	 */
	public String getFortunename() {
		return fortunename;
	}
	
	/**
	 * 運勢名をセットする。
	 * @param fortunename　運勢名
	 */
	public void setFortunename(String fortunename) {
		this.fortunename = fortunename;
	}
	
	/**
	 * 運勢数を受け取る。
	 * @return 運勢数
	 */
	public Integer getFortunecount() {
		return fortunecount;
	}
	
	/**
	 * 運勢数をセットする。
	 * @param fortunecount　運勢数
	 */
	public void setFortunecount(Integer fortunecount) {
		this.fortunecount = fortunecount;
	}
	
	/**
	 * 割合を受け取る。
	 * @return 割合
	 */
	public Integer getTotalpercent() {
		return totalpercent;
	}
	
	/**
	 * 割合をセットする。
	 * @param totalpercent　割合
	 */
	public void setTotalpercent(Integer totalpercent) {
		this.totalpercent = totalpercent;
	}
	
}
