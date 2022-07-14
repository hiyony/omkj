package com.omkj.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 初期画面から入力された値を保存するフォームクラスです。
 * 
 * @author h_kim
 * @version 1.0
 */
public class InputForm {
	
	/** 誕生日 */
	@NotNull
	@Size(min=8, max=8, message="必須項目です！yyyyMMddの形式で入力してください。")
	private String birthday;
	
	/**
	 * 誕生日を受け取る。
	 * @return 誕生日
	 */
	public String getBirthday() {
		return birthday;
	}
	
	/**
	 * 誕生日をセットする。
	 * @param birthday　誕生日
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "InputForm [birthday=" + birthday + "]";
	}

}
