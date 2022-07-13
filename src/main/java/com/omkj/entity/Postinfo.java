package com.omkj.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = PostinfoListener.class)
@Table(name = "postinfo")
public class Postinfo {

    /** */
    @Column(name = "zipcode")
    public String zipcode;

    /** */
    @Column(name = "homeaddress1")
    public String homeaddress1;

    /** */
    @Column(name = "homeaddress2")
    public String homeaddress2;

    /** */
    @Column(name = "homeaddress3")
    public String homeaddress3;

    /** */
    @Column(name = "homeaddress")
    public String homeaddress;

    /** 
     * Returns the zipcode.
     * 
     * @return the zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    /** 
     * Sets the zipcode.
     * 
     * @param zipcode the zipcode
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    /** 
     * Returns the homeaddress1.
     * 
     * @return the homeaddress1
     */
    public String getHomeaddress1() {
        return homeaddress1;
    }

    /** 
     * Sets the homeaddress1.
     * 
     * @param homeaddress1 the homeaddress1
     */
    public void setHomeaddress1(String homeaddress1) {
        this.homeaddress1 = homeaddress1;
    }

    /** 
     * Returns the homeaddress2.
     * 
     * @return the homeaddress2
     */
    public String getHomeaddress2() {
        return homeaddress2;
    }

    /** 
     * Sets the homeaddress2.
     * 
     * @param homeaddress2 the homeaddress2
     */
    public void setHomeaddress2(String homeaddress2) {
        this.homeaddress2 = homeaddress2;
    }

    /** 
     * Returns the homeaddress3.
     * 
     * @return the homeaddress3
     */
    public String getHomeaddress3() {
        return homeaddress3;
    }

    /** 
     * Sets the homeaddress3.
     * 
     * @param homeaddress3 the homeaddress3
     */
    public void setHomeaddress3(String homeaddress3) {
        this.homeaddress3 = homeaddress3;
    }

    /** 
     * Returns the homeaddress.
     * 
     * @return the homeaddress
     */
    public String getHomeaddress() {
        return homeaddress;
    }

    /** 
     * Sets the homeaddress.
     * 
     * @param homeaddress the homeaddress
     */
    public void setHomeaddress(String homeaddress) {
        this.homeaddress = homeaddress;
    }
}