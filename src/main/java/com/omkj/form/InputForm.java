package com.omkj.form;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class InputForm {
	
	@NotNull
	@Size(min=8, max=8)
	private String birthday;

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "InputForm [birthday=" + birthday + "]";
	}

}
