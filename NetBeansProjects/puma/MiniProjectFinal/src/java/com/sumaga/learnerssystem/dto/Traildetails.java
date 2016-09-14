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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
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
    @NamedQuery(name = "Traildetails.findAll", query = "SELECT t FROM Traildetails t"),
    @NamedQuery(name = "Traildetails.findByRegNo", query = "SELECT t FROM Traildetails t WHERE t.traildetailsPK.regNo = :regNo"),
    @NamedQuery(name = "Traildetails.findByDate", query = "SELECT t FROM Traildetails t WHERE t.traildetailsPK.date = :date"),
    @NamedQuery(name = "Traildetails.findByVehicleClass", query = "SELECT t FROM Traildetails t WHERE t.vehicleClass = :vehicleClass")})
public class Traildetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TraildetailsPK traildetailsPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(nullable = false, length = 30)
    private String vehicleClass;
    @JoinColumn(name = "regNo", referencedColumnName = "regNo", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Registrationdetails registrationdetails;

    public Traildetails() {
    }

    public Traildetails(TraildetailsPK traildetailsPK) {
        this.traildetailsPK = traildetailsPK;
    }

    public Traildetails(TraildetailsPK traildetailsPK, String vehicleClass) {
        this.traildetailsPK = traildetailsPK;
        this.vehicleClass = vehicleClass;
    }

    public Traildetails(String regNo, Date date) {
        this.traildetailsPK = new TraildetailsPK(regNo, date);
    }

    public TraildetailsPK getTraildetailsPK() {
        return traildetailsPK;
    }

    public void setTraildetailsPK(TraildetailsPK traildetailsPK) {
        this.traildetailsPK = traildetailsPK;
    }

    public String getVehicleClass() {
        return vehicleClass;
    }

    public void setVehicleClass(String vehicleClass) {
        this.vehicleClass = vehicleClass;
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
        hash += (traildetailsPK != null ? traildetailsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Traildetails)) {
            return false;
        }
        Traildetails other = (Traildetails) object;
        if ((this.traildetailsPK == null && other.traildetailsPK != null) || (this.traildetailsPK != null && !this.traildetailsPK.equals(other.traildetailsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sumaga.learnerssystem.dto.Traildetails[ traildetailsPK=" + traildetailsPK + " ]";
    }
    
}
