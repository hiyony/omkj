package com.omkj.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = FortunemasterListener.class)
@Table(name = "fortunemaster")
public class Fortunemaster {

    /** */
    @Column(name = "unseiname")
    public String unseiname;

    /** */
    @Id
    @Column(name = "unseicode")
    public String unseicode;

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
     * Returns the unseiname.
     * 
     * @return the unseiname
     */
    public String getUnseiname() {
        return unseiname;
    }

    /** 
     * Sets the unseiname.
     * 
     * @param unseiname the unseiname
     */
    public void setUnseiname(String unseiname) {
        this.unseiname = unseiname;
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