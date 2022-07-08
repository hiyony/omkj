package com.omkj.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

import lombok.Data;

@Table(name = "unseiresult")
@Entity
@Data
public class Unseiresult {
	
    /** uranaidateプロパティ */
    @Column(name = "uranaidate")
    public String uranaidate;

    /** birthdayプロパティ */
    @Column(name = "birthday")
    public String birthday;

    /** omikujicodeプロパティ */
    @Column(name = "omikujicode")
    public String omikujicode;

    /** renewalwriterプロパティ */
    @Column(name = "renewalwriter")
    public String renewalwriter;

    /** renewaldateプロパティ */
    @Column(name = "renewaldate")
    public String renewaldate;

    /** unseiwriterプロパティ */
    @Column(name = "unseiwriter")
    public String unseiwriter;

    /** unseiwritedateプロパティ */
    @Column(name = "unseiwritedate")
    public String unseiwritedate;
}
