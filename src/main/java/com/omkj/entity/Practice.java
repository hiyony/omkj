package com.omkj.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = PracticeListener.class)
@Table(name = "practice")
public class Practice {

    /** */
    @Id
    @Column(name = "pr1")
    Integer pr1;

    /** */
    @Column(name = "pr2")
    String pr2;

    /** 
     * Returns the pr1.
     * 
     * @return the pr1
     */
    public Integer getPr1() {
        return pr1;
    }

    /** 
     * Sets the pr1.
     * 
     * @param pr1 the pr1
     */
    public void setPr1(Integer pr1) {
        this.pr1 = pr1;
    }

    /** 
     * Returns the pr2.
     * 
     * @return the pr2
     */
    public String getPr2() {
        return pr2;
    }

    /** 
     * Sets the pr2.
     * 
     * @param pr2 the pr2
     */
    public void setPr2(String pr2) {
        this.pr2 = pr2;
    }
}