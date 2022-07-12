package com.omkj.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;

@Entity
public class OmikujiiSave {
	
	@Column(name = "unseiname")
	private String unseiname;
	
	@Column(name = "negaigoto")
	private String negaigoto;
	
	@Column(name = "akinai")
	private String akinai;
	
	@Column(name = "gakumon")
	private String gakumon;
	

	public String getUnseiname() {
		return unseiname;
	}
	public void setUnseiname(String unseiname) {
		this.unseiname = unseiname;
	}
	public String getNegaigoto() {
		return negaigoto;
	}
	public void setNegaigoto(String negaigoto) {
		this.negaigoto = negaigoto;
	}
	public String getAkinai() {
		return akinai;
	}
	public void setAkinai(String akinai) {
		this.akinai = akinai;
	}
	public String getGakumon() {
		return gakumon;
	}
	public void setGakumon(String gakumon) {
		this.gakumon = gakumon;
	}
	
}