package com.omkj.entity.dto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PercentDto {

	private Integer fortunecount;
	private Integer totalpercent;
	private String fortunename;
	private String fortunecode;
	
	public Integer getFortunecount() {
		return fortunecount;
	}
	public void setFortunecount(Integer fortunecount) {
		this.fortunecount = fortunecount;
	}
	public Integer getTotalpercent() {
		return totalpercent;
	}
	public void setTotalpercent(Integer totalpercent) {
		this.totalpercent = totalpercent;
	}
	public String getFortunename() {
		return fortunename;
	}
	public void setFortunename(String fortunename) {
		this.fortunename = fortunename;
	}
	public String getFortunecode() {
		return fortunecode;
	}
	public void setFortunecode(String fortunecode) {
		this.fortunecode = fortunecode;
	}
	
	
}
