package com.omkj.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = SqlPartsListener.class)
@Table(name = "sql_parts")
public class SqlParts {

    /** */
    @Column(name = "feature_id")
    String featureId;

    /** */
    @Column(name = "feature_name")
    String featureName;

    /** */
    @Column(name = "is_supported")
    String isSupported;

    /** */
    @Column(name = "is_verified_by")
    String isVerifiedBy;

    /** */
    @Column(name = "comments")
    String comments;

    /** 
     * Returns the featureId.
     * 
     * @return the featureId
     */
    public String getFeatureId() {
        return featureId;
    }

    /** 
     * Sets the featureId.
     * 
     * @param featureId the featureId
     */
    public void setFeatureId(String featureId) {
        this.featureId = featureId;
    }

    /** 
     * Returns the featureName.
     * 
     * @return the featureName
     */
    public String getFeatureName() {
        return featureName;
    }

    /** 
     * Sets the featureName.
     * 
     * @param featureName the featureName
     */
    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    /** 
     * Returns the isSupported.
     * 
     * @return the isSupported
     */
    public String getIsSupported() {
        return isSupported;
    }

    /** 
     * Sets the isSupported.
     * 
     * @param isSupported the isSupported
     */
    public void setIsSupported(String isSupported) {
        this.isSupported = isSupported;
    }

    /** 
     * Returns the isVerifiedBy.
     * 
     * @return the isVerifiedBy
     */
    public String getIsVerifiedBy() {
        return isVerifiedBy;
    }

    /** 
     * Sets the isVerifiedBy.
     * 
     * @param isVerifiedBy the isVerifiedBy
     */
    public void setIsVerifiedBy(String isVerifiedBy) {
        this.isVerifiedBy = isVerifiedBy;
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