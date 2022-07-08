package com.omkj.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

import lombok.Data;

@Table(name = "omikujii")
@Entity
@Data
public class Omikujii {
	
    /** omikujicodeプロパティ */
    @Id
    @Column(name = "omikujicode")
    public String omikujicode;

    /** unseicodeプロパティ */
    @Column(name = "unseicode")
    public String unseicode;

    /** negaigotoプロパティ */
    @Column(name = "negaigoto")
    public String negaigoto;

    /** akinaiプロパティ */
    @Column(name = "akinai")
    public String akinai;

    /** gakumonプロパティ */
    @Column(name = "gakumon")
    public String gakumon;

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
