package com.omkj.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = SqlImplementationInfoListener.class)
@Table(name = "sql_implementation_info")
public class SqlImplementationInfo {

    /** */
    @Column(name = "implementation_info_id")
    String implementationInfoId;

    /** */
    @Column(name = "implementation_info_name")
    String implementationInfoName;

    /** */
    @Column(name = "integer_value")
    String integerValue;

    /** */
    @Column(name = "character_value")
    String characterValue;

    /** */
    @Column(name = "comments")
    String comments;

    /** 
     * Returns the implementationInfoId.
     * 
     * @return the implementationInfoId
     */
    public String getImplementationInfoId() {
        return implementationInfoId;
    }

    /** 
     * Sets the implementationInfoId.
     * 
     * @param implementationInfoId the implementationInfoId
     */
    public void setImplementationInfoId(String implementationInfoId) {
        this.implementationInfoId = implementationInfoId;
    }

    /** 
     * Returns the implementationInfoName.
     * 
     * @return the implementationInfoName
     */
    public String getImplementationInfoName() {
        return implementationInfoName;
    }

    /** 
     * Sets the implementationInfoName.
     * 
     * @param implementationInfoName the implementationInfoName
     */
    public void setImplementationInfoName(String implementationInfoName) {
        this.implementationInfoName = implementationInfoName;
    }

    /** 
     * Returns the integerValue.
     * 
     * @return the integerValue
     */
    public String getIntegerValue() {
        return integerValue;
    }

    /** 
     * Sets the integerValue.
     * 
     * @param integerValue the integerValue
     */
    public void setIntegerValue(String integerValue) {
        this.integerValue = integerValue;
    }

    /** 
     * Returns the characterValue.
     * 
     * @return the characterValue
     */
    public String getCharacterValue() {
        return characterValue;
    }

    /** 
     * Sets the characterValue.
     * 
     * @param characterValue the characterValue
     */
    public void setCharacterValue(String characterValue) {
        this.characterValue = characterValue;
    }

    /** 
     * Returns the comments.
     * 
     * @return the comments
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Sets the comments.
     * 
     * @param comments the comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
}