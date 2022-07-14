package com.omkj.entity.dto;

/**
 * データベースから受け取った内容を保存するDTOクラスです。
 * DTOクラス＝単純データ移送クラス。
 * 
 * @author h_kim
 * @version 1.0
 */
public class GetaddressDto {
	
	/** 郵便番号 */
	public String zipcode;
	
	/** 住所 */
	public String address;
}
