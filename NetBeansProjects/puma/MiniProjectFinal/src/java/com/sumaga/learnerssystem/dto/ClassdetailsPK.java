/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumaga.learnerssystem.dto;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Thamira
 */
@Embeddable
public class ClassdetailsPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(nullable = false, length = 10)
    private String regNo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(nullable = false, length = 3)
    private String lessonsNo;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date date;

    public ClassdetailsPK() {
    }

    public ClassdetailsPK(String regNo, String lessonsNo, Date date) {
        this.regNo = regNo;
        this.lessonsNo = lessonsNo;
        this.date = date;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getLessonsNo() {
        return lessonsNo;
    }

    public void setLessonsNo(String lessonsNo) {
        this.lessonsNo = lessonsNo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (regNo != null ? regNo.hashCode() : 0);
        hash += (lessonsNo != null ? lessonsNo.hashCode() : 0);
        hash += (date != null ? date.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClassdetailsPK)) {
            return false;
        }
        ClassdetailsPK other = (ClassdetailsPK) object;
        if ((this.regNo == null && other.regNo != null) || (this.regNo != null && !this.regNo.equals(other.regNo))) {
            return false;
        }
        if ((this.lessonsNo == null && other.lessonsNo != null) || (this.lessonsNo != null && !this.lessonsNo.equals(other.lessonsNo))) {
            return false;
        }
        if ((this.date == null && other.date != null) || (this.date != null && !this.date.equals(other.date))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sumaga.learnerssystem.dto.ClassdetailsPK[ regNo=" + regNo + ", lessonsNo=" + lessonsNo + ", date=" + date + " ]";
    }
    
}
