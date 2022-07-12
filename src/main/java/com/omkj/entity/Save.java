package com.omkj.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = SaveListener.class)
@Table(name = "save")
public class Save {

    /** */
    @Column(name = "name")
    String name;

    /** */
    @Column(name = "zipcode")
    String zipcode;

    /** */
    @Column(name = "homeaddress")
    String homeaddress;

    /** */
    @Column(name = "emailaddress")
    String emailaddress;

    /** 
     * Returns the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /** 
     * Sets the name.
     * 
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

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

    /** 
     * Returns the emailaddress.
     * 
     * @return the emailaddress
     */
    public String getEmailaddress() {
        return emailaddress;
    }

    /** 
     * Sets the emailaddress.
     * 
     * @param emailaddress the emailaddress
     */
    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }
}