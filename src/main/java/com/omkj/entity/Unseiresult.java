package com.omkj.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = UnseiresultListener.class)
@Table(name = "unseiresult")
public class Unseiresult {

    /** */
    @Column(name = "uranaidate")
    public String uranaidate;

    /** */
    @Column(name = "birthday")
    public String birthday;

    /** */
    @Column(name = "omikujicode")
    public String omikujicode;

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
     * Returns the uranaidate.
     * 
     * @return the uranaidate
     */
    public String getUranaidate() {
        return uranaidate;
    }

    /** 
     * Sets the uranaidate.
     * 
     * @param uranaidate the uranaidate
     */
    public void setUranaidate(String uranaidate) {
        this.uranaidate = uranaidate;
    }

    /** 
     * Returns the birthday.
     * 
     * @return the birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /** 
     * Sets the birthday.
     * 
     * @param birthday the birthday
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

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