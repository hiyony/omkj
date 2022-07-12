package com.omkj.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = SqlSizingListener.class)
@Table(name = "sql_sizing")
public class SqlSizing {

    /** */
    @Column(name = "sizing_id")
    String sizingId;

    /** */
    @Column(name = "sizing_name")
    String sizingName;

    /** */
    @Column(name = "supported_value")
    String supportedValue;

    /** */
    @Column(name = "comments")
    String comments;

    /** 
     * Returns the sizingId.
     * 
     * @return the sizingId
     */
    public String getSizingId() {
        return sizingId;
    }

    /** 
     * Sets the sizingId.
     * 
     * @param sizingId the sizingId
     */
    public void setSizingId(String sizingId) {
        this.sizingId = sizingId;
    }

    /** 
     * Returns the sizingName.
     * 
     * @return the sizingName
     */
    public String getSizingName() {
        return sizingName;
    }

    /** 
     * Sets the sizingName.
     * 
     * @param sizingName the sizingName
     */
    public void setSizingName(String sizingName) {
        this.sizingName = sizingName;
    }

    /** 
     * Returns the supportedValue.
     * 
     * @return the supportedValue
     */
    public String getSupportedValue() {
        return supportedValue;
    }

    /** 
     * Sets the supportedValue.
     * 
     * @param supportedValue the supportedValue
     */
    public void setSupportedValue(String supportedValue) {
        this.supportedValue = supportedValue;
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