/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumaga.learnerssystem.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Thamira
 */
@Entity
@Table(catalog = "lernersSql", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Account.findAll", query = "SELECT a FROM Account a"),
    @NamedQuery(name = "Account.findByRegNo", query = "SELECT a FROM Account a WHERE a.regNo = :regNo"),
    @NamedQuery(name = "Account.findByDate", query = "SELECT a FROM Account a WHERE a.date = :date"),
    @NamedQuery(name = "Account.findByFullAmount", query = "SELECT a FROM Account a WHERE a.fullAmount = :fullAmount"),
    @NamedQuery(name = "Account.findByAccountNumberA", query = "SELECT a FROM Account a WHERE a.accountNumberA = :accountNumberA")})
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(nullable = false, length = 20)
    private String regNo;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private double fullAmount;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(nullable = false, length = 20)
    private String accountNumberA;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accountNumberA", fetch = FetchType.EAGER)
    private Collection<Personalaccount> personalaccountCollection;
    @JoinColumn(name = "regNo", referencedColumnName = "regNo", nullable = false, insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.EAGER)
    private Registrationdetails registrationdetails;

    public Account() {
    }

    public Account(String regNo) {
        this.regNo = regNo;
    }

    public Account(String regNo, Date date, double fullAmount, String accountNumberA) {
        this.regNo = regNo;
        this.date = date;
        this.fullAmount = fullAmount;
        this.accountNumberA = accountNumberA;
    }
    @JsonProperty("regNo")
    public String getRegNo() {
        return regNo;
    }
    @JsonProperty("regNo")
    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }
    @JsonProperty("date")
    public Date getDate() {
        return date;
    }
    @JsonProperty("date")
    public void setDate(Date date) {
        this.date = date;
    }
    @JsonProperty("fullAmount")
    public double getFullAmount() {
        return fullAmount;
    }
    @JsonProperty("fullAmount")
    public void setFullAmount(double fullAmount) {
        this.fullAmount = fullAmount;
    }
    @JsonProperty("accountNumberA")
    public String getAccountNumberA() {
        return accountNumberA;
    }
     @JsonProperty("accountNumberA")
    public void setAccountNumberA(String accountNumberA) {
        this.accountNumberA = accountNumberA;
    }

    @XmlTransient
    public Collection<Personalaccount> getPersonalaccountCollection() {
        return personalaccountCollection;
    }

    public void setPersonalaccountCollection(Collection<Personalaccount> personalaccountCollection) {
        this.personalaccountCollection = personalaccountCollection;
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
        if (!(object instanceof Account)) {
            return false;
        }
        Account other = (Account) object;
        if ((this.regNo == null && other.regNo != null) || (this.regNo != null && !this.regNo.equals(other.regNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sumaga.learnerssystem.dto.Account[ regNo=" + regNo + " ]";
    }
    
}
