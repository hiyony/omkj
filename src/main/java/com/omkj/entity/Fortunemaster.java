package com.omkj.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

import lombok.Data;

@Table(name = "fortunemaster")
@Entity
@Data
public class Fortunemaster {
	
    @Column(name = "unseiname")
	public String unseiname;
	
	@Id
    @Column(name = "unseicode")
	public String unseicode;
	
	@Column(name = "renewalwriter")
	public String renewalwriter;	
	
	@Column(name = "renewaldate")
	public String renewaldate;	
	
	@Column(name = "unseiwriter")
	public String unseiwriter;	
	
	@Column(name = "unseiwritedate")
	public String unseiwritedate;
	
}
