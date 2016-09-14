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

/**
 *
 * @author Thamira
 */
@Entity
@Table(catalog = "lernersSql", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lpermit.findAll", query = "SELECT l FROM Lpermit l"),
    @NamedQuery(name = "Lpermit.findByRegNo", query = "SELECT l FROM Lpermit l WHERE l.regNo = :regNo"),
    @NamedQuery(name = "Lpermit.findByIssueDate", query = "SELECT l FROM Lpermit l WHERE l.issueDate = :issueDate"),
    @NamedQuery(name = "Lpermit.findByExpdate", query = "SELECT l FROM Lpermit l WHERE l.expdate = :expdate")})
public class Lpermit implements Serializable {

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
    @Temporal(TemporalType.DATE)
    private Date issueDate;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date expdate;
    @JoinColumn(name = "regNo", referencedColumnName = "regNo", nullable = false, insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.EAGER)
    private Registrationdetails registrationdetails;

    public Lpermit() {
    }

    public Lpermit(String regNo) {
        this.regNo = regNo;
    }

    public Lpermit(String regNo, Date issueDate, Date expdate) {
        this.regNo = regNo;
        this.issueDate = issueDate;
        this.expdate = expdate;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getExpdate() {
        return expdate;
    }

    public void setExpdate(Date expdate) {
        this.expdate = expdate;
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
        if (!(object instanceof Lpermit)) {
            return false;
        }
        Lpermit other = (Lpermit) object;
        if ((this.regNo == null && other.regNo != null) || (this.regNo != null && !this.regNo.equals(other.regNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sumaga.learnerssystem.dto.Lpermit[ regNo=" + regNo + " ]";
    }
    
}
