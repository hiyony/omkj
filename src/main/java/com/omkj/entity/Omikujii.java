package com.omkj.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = OmikujiiListener.class)
@Table(name = "omikujii")
public class Omikujii {

    /** */
    @Id
    @Column(name = "omikujicode")
    public String omikujicode;

    /** */
    @Column(name = "unseicode")
    public String unseicode;

    /** */
    @Column(name = "negaigoto")
    public String negaigoto;

    /** */
    @Column(name = "akinai")
    public String akinai;

    /** */
    @Column(name = "gakumon")
    public String gakumon;

    /** */
    @Column(name = "renewalwriter")
    public String renewalwriter;

    /** */
    @Column(name = "renewaldate")
    public String renewaldate;

    /** */
    @Column(name = "unseiwriter")
    public String unseiwriter;

    /** */
    @Column(name = "unseiwritedate")
    public String unseiwritedate;

    /** 
     * Returns the omikujicode.
     * 
     * @return the omikujicode
     */
    public String getOmikujicode() {
        return omikujicode;
    }

    /** 
     * Sets the omikujicode.
     * 
     * @param omikujicode the omikujicode
     */
    public void setOmikujicode(String omikujicode) {
        this.omikujicode = omikujicode;
    }

    /** 
     * Returns the unseicode.
     * 
     * @return the unseicode
     */
    public String getUnseicode() {
        return unseicode;
    }

    /** 
     * Sets the unseicode.
     * 
     * @param unseicode the unseicode
     */
    public void setUnseicode(String unseicode) {
        this.unseicode = unseicode;
    }

    /** 
     * Returns the negaigoto.
     * 
     * @return the negaigoto
     */
    public String getNegaigoto() {
        return negaigoto;
    }

    /** 
     * Sets the negaigoto.
     * 
     * @param negaigoto the negaigoto
     */
    public void setNegaigoto(String negaigoto) {
        this.negaigoto = negaigoto;
    }

    /** 
     * Returns the akinai.
     * 
     * @return the akinai
     */
    public String getAkinai() {
        return akinai;
    }

    /** 
     * Sets the akinai.
     * 
     * @param akinai the akinai
     */
    public void setAkinai(String akinai) {
        this.akinai = akinai;
    }

    /** 
     * Returns the gakumon.
     * 
     * @return the gakumon
     */
    public String getGakumon() {
        return gakumon;
    }

    /** 
     * Sets the gakumon.
     * 
     * @param gakumon the gakumon
     */
    public void setGakumon(String gakumon) {
        this.gakumon = gakumon;
    }

    /** 
     * Returns the renewalwriter.
     * 
     * @return the renewalwriter
     */
    public String getRenewalwriter() {
        return renewalwriter;
    }

    /** 
     * Sets the renewalwriter.
     * 
     * @param renewalwriter the renewalwriter
     */
    public void setRenewalwriter(String renewalwriter) {
        this.renewalwriter = renewalwriter;
    }

    /** 
     * Returns the renewaldate.
     * 
     * @return the renewaldate
     */
    public String getRenewaldate() {
        return renewaldate;
    }

    /** 
     * Sets the renewaldate.
     * 
     * @param renewaldate the renewaldate
     */
    public void setRenewaldate(String renewaldate) {
        this.renewaldate = renewaldate;
    }

    /** 
     * Returns the unseiwriter.
     * 
     * @return the unseiwriter
     */
    public String getUnseiwriter() {
        return unseiwriter;
    }

    /** 
     * Sets the unseiwriter.
     * 
     * @param unseiwriter the unseiwriter
     */
    public void setUnseiwriter(String unseiwriter) {
        this.unseiwriter = unseiwriter;
    }

    /** 
     * Returns the unseiwritedate.
     * 
     * @return the unseiwritedate
     */
    public String getUnseiwritedate() {
        return unseiwritedate;
    }

    /** 
     * Sets the unseiwritedate.
     * 
     * @param unseiwritedate the unseiwritedate
     */
    public void setUnseiwritedate(String unseiwritedate) {
        this.unseiwritedate = unseiwritedate;
    }
}