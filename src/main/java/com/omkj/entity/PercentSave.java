package com.omkj.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;

@Entity
public class PercentSave {
	
	@Column(name = "fortunecode")
	public String fortunecode;

	@Column(name = "fortunename")
	public String fortunename;
	
	@Column(name = "fortunecount")
	public Integer fortunecount;
	
	@Column(name = "totalpercent")
	public Integer totalpercent;
	
	public PercentSave() {
		super();
	}

	public PercentSave(String fortunecode, String fortunename, Integer fortunecount, Integer totalpercent) {
		super();
		this.fortunecode = fortunecode;
		this.fortunename = fortunename;
		this.fortunecount = fortunecount;
		this.totalpercent = totalpercent;
	}

	public String getFortunecode() {
		return fortunecode;
	}

	public void setFortunecode(String fortunecode) {
		this.fortunecode = fortunecode;
	}

	public String getFortunename() {
		return fortunename;
	}

	public void setFortunename(String fortunename) {
		this.fortunename = fortunename;
	}

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
	
	
}
