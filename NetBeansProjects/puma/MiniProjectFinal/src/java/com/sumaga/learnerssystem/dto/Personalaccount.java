/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumaga.learnerssystem.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
    @NamedQuery(name = "Personalaccount.findAll", query = "SELECT p FROM Personalaccount p"),
    @NamedQuery(name = "Personalaccount.findByAccountNumberB", query = "SELECT p FROM Personalaccount p WHERE p.accountNumberB = :accountNumberB"),
    @NamedQuery(name = "Personalaccount.findByAmount", query = "SELECT p FROM Personalaccount p WHERE p.amount = :amount"),
    @NamedQuery(name = "Personalaccount.findByDate", query = "SELECT p FROM Personalaccount p WHERE p.date = :date")})
public class Personalaccount implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(nullable = false, length = 20)
    private String accountNumberB;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private double amount;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date date;
    @JoinColumn(name = "accountNumberA", referencedColumnName = "accountNumberA", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Account accountNumberA;

    public Personalaccount() {
    }

    public Personalaccount(String accountNumberB) {
        this.accountNumberB = accountNumberB;
    }

    public Personalaccount(String accountNumberB, double amount, Date date) {
        this.accountNumberB = accountNumberB;
        this.amount = amount;
        this.date = date;
    }
 @JsonProperty("accountNumberB")
    public String getAccountNumberB() {
        return accountNumberB;
    }
 @JsonProperty("accountNumberB")
    public void setAccountNumberB(String accountNumberB) {
        this.accountNumberB = accountNumberB;
    }
 @JsonProperty("amount")
    public double getAmount() {
        return amount;
    }
 @JsonProperty("amount")
    public void setAmount(double amount) {
        this.amount = amount;
    }
 @JsonProperty("date")
    public Date getDate() {
        return date;
    }
 @JsonProperty("date")
    public void setDate(Date date) {
        this.date = date;
    }
 @JsonProperty("accountNumberA")
    public Account getAccountNumberA() {
        return accountNumberA;
    }
 @JsonProperty("accountNumberA")
    public void setAccountNumberA(Account accountNumberA) {
        this.accountNumberA = accountNumberA;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountNumberB != null ? accountNumberB.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personalaccount)) {
            return false;
        }
        Personalaccount other = (Personalaccount) object;
        if ((this.accountNumberB == null && other.accountNumberB != null) || (this.accountNumberB != null && !this.accountNumberB.equals(other.accountNumberB))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sumaga.learnerssystem.dto.Personalaccount[ accountNumberB=" + accountNumberB + " ]";
    }
    
}
