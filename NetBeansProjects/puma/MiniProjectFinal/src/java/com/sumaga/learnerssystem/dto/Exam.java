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
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author Thamira
 */
@Entity
@Table(catalog = "lernersSql", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Exam.findAll", query = "SELECT e FROM Exam e"),
    @NamedQuery(name = "Exam.findByRegNo", query = "SELECT e FROM Exam e WHERE e.regNo = :regNo"),
    @NamedQuery(name = "Exam.findByMark", query = "SELECT e FROM Exam e WHERE e.mark = :mark"),
    @NamedQuery(name = "Exam.findByDate", query = "SELECT e FROM Exam e WHERE e.date = :date")})
public class Exam implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(nullable = false, length = 10)
    private String regNo;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private int mark;
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date date;
    @JoinColumn(name = "regNo", referencedColumnName = "regNo", nullable = false, insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.EAGER)
    private Registrationdetails registrationdetails;

    public Exam() {
    }

    public Exam(String regNo) {
        this.regNo = regNo;
    }

    public Exam(String regNo, int mark, Date date) {
        this.regNo = regNo;
        this.mark = mark;
        this.date = date;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Registrationdetails getRegistrationdetails() {
        return registrationdetails;
    }

    public void setRegistrationdetails(Registrationdetails registrationdetails) {
        this.registrationdetails = registrationdetails;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (regNo != null ? regNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Exam)) {
            return false;
        }
        Exam other = (Exam) object;
        if ((this.regNo == null && other.regNo != null) || (this.regNo != null && !this.regNo.equals(other.regNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sumaga.learnerssystem.dto.Exam[ regNo=" + regNo + " ]";
    }
    
}
