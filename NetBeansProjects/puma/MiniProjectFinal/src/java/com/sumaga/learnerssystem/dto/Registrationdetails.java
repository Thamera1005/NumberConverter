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
import javax.persistence.ManyToOne;
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
    @NamedQuery(name = "Registrationdetails.findAll", query = "SELECT r FROM Registrationdetails r"),
    @NamedQuery(name = "Registrationdetails.findByRegNo", query = "SELECT r FROM Registrationdetails r WHERE r.regNo = :regNo"),
    @NamedQuery(name = "Registrationdetails.findByDay", query = "SELECT r FROM Registrationdetails r WHERE r.day = :day"),

    @NamedQuery(name = "Registrationdetails.findByDrivingLicenceClasses", query = "SELECT r FROM Registrationdetails r WHERE r.drivingLicenceClasses = :drivingLicenceClasses"),
    @NamedQuery(name = "Registrationdetails.findByVehicleRestrictions", query = "SELECT r FROM Registrationdetails r WHERE r.vehicleRestrictions = :vehicleRestrictions"),
    @NamedQuery(name = "Registrationdetails.findByTransactionType", query = "SELECT r FROM Registrationdetails r WHERE r.transactionType = :transactionType"),
    @NamedQuery(name = "Registrationdetails.findByLicenceIssuedate", query = "SELECT r FROM Registrationdetails r WHERE r.licenceIssuedate = :licenceIssuedate"),
    @NamedQuery(name = "Registrationdetails.findByNTMIDate", query = "SELECT r FROM Registrationdetails r WHERE r.nTMIDate = :nTMIDate"),
    @NamedQuery(name = "Registrationdetails.findByNTMINumber", query = "SELECT r FROM Registrationdetails r WHERE r.nTMINumber = :nTMINumber"),
    @NamedQuery(name = "Registrationdetails.findByOldDrivingLicenceNumber", query = "SELECT r FROM Registrationdetails r WHERE r.oldDrivingLicenceNumber = :oldDrivingLicenceNumber")})
public class Registrationdetails implements Serializable {

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
    private Date day;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(nullable = false, length = 50)
    private String drivingLicenceClasses;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(nullable = false, length = 30)
    private String vehicleRestrictions;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(nullable = false, length = 20)
    private String transactionType;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date licenceIssuedate;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date nTMIDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(nullable = false, length = 15)
    private String nTMINumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(nullable = false, length = 15)
    private String oldDrivingLicenceNumber;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "registrationdetails", fetch = FetchType.EAGER)
    private Exam exam;
    @JoinColumn(name = "nic", referencedColumnName = "nic")
    @ManyToOne(fetch = FetchType.EAGER)
    private Personaldetail nic;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "registrationdetails", fetch = FetchType.EAGER)
    private Lpermit lpermit;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "registrationdetails", fetch = FetchType.EAGER)
    private Collection<Classdetails> classdetailsCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "registrationdetails", fetch = FetchType.EAGER)
    private Account account;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "registrationdetails", fetch = FetchType.EAGER)
    private Collection<Traildetails> traildetailsCollection;

    public Registrationdetails() {
    }

    public Registrationdetails(String regNo) {
        this.regNo = regNo;
    }

    public Registrationdetails(String regNo, Date day, String drivingLicenceClasses, String vehicleRestrictions, String transactionType, Date licenceIssuedate, Date nTMIDate, String nTMINumber, String oldDrivingLicenceNumber) {
        this.regNo = regNo;
        this.day = day;
        this.drivingLicenceClasses = drivingLicenceClasses;
        this.vehicleRestrictions = vehicleRestrictions;
        this.transactionType = transactionType;
        this.licenceIssuedate = licenceIssuedate;
        this.nTMIDate = nTMIDate;
        this.nTMINumber = nTMINumber;
        this.oldDrivingLicenceNumber = oldDrivingLicenceNumber;
    }

    @JsonProperty("regNo")
    public String getRegNo() {
        return regNo;
    }

    @JsonProperty("regNo")
    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    @JsonProperty("day")
    public Date getDay() {
        return day;
    }

    @JsonProperty("day")
    public void setDay(Date day) {
        this.day = day;
    }

    @JsonProperty("drivingLicenceClasses")
    public String getDrivingLicenceClasses() {
        return drivingLicenceClasses;
    }

    @JsonProperty("drivingLicenceClasses")
    public void setDrivingLicenceClasses(String drivingLicenceClasses) {
        this.drivingLicenceClasses = drivingLicenceClasses;
    }

    @JsonProperty("vehicleRestrictions")
    public String getVehicleRestrictions() {
        return vehicleRestrictions;
    }

    @JsonProperty("vehicleRestrictions")
    public void setVehicleRestrictions(String vehicleRestrictions) {
        this.vehicleRestrictions = vehicleRestrictions;
    }

    @JsonProperty("transactionType")
    public String getTransactionType() {
        return transactionType;
    }

    @JsonProperty("transactionType")
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    @JsonProperty("licenceIssuedate")
    public Date getLicenceIssuedate() {
        return licenceIssuedate;
    }

    @JsonProperty("licenceIssuedate")
    public void setLicenceIssuedate(Date licenceIssuedate) {
        this.licenceIssuedate = licenceIssuedate;
    }

    @JsonProperty("nTMIDate")
    public Date getNTMIDate() {
        return nTMIDate;
    }

    @JsonProperty("nTMIDate")
    public void setNTMIDate(Date nTMIDate) {
        this.nTMIDate = nTMIDate;
    }

    @JsonProperty("nTMINumber")
    public String getNTMINumber() {
        return nTMINumber;
    }

    @JsonProperty("nTMINumber")
    public void setNTMINumber(String nTMINumber) {
        this.nTMINumber = nTMINumber;
    }

    @JsonProperty("oldDrivingLicenceNumber")
    public String getOldDrivingLicenceNumber() {
        return oldDrivingLicenceNumber;
    }

    @JsonProperty("oldDrivingLicenceNumber")
    public void setOldDrivingLicenceNumber(String oldDrivingLicenceNumber) {
        this.oldDrivingLicenceNumber = oldDrivingLicenceNumber;
    }

//    @JsonProperty("exam")
    public Exam getExam() {
        return exam;
    }

//    @JsonProperty("exam")
    public void setExam(Exam exam) {
        this.exam = exam;
    }

//    @JsonProperty("nic")
    public Personaldetail getNic() {
        return nic;
    }

//    @JsonProperty("nic")
    public void setNic(Personaldetail nic) {
        this.nic = nic;
    }

//    @JsonProperty("lpermit")
    public Lpermit getLpermit() {
        return lpermit;
    }

//    @JsonProperty("lpermit")
    public void setLpermit(Lpermit lpermit) {
        this.lpermit = lpermit;
    }

    @XmlTransient
    public Collection<Classdetails> getClassdetailsCollection() {
        return classdetailsCollection;
    }

    public void setClassdetailsCollection(Collection<Classdetails> classdetailsCollection) {
        this.classdetailsCollection = classdetailsCollection;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @XmlTransient
    public Collection<Traildetails> getTraildetailsCollection() {
        return traildetailsCollection;
    }

    public void setTraildetailsCollection(Collection<Traildetails> traildetailsCollection) {
        this.traildetailsCollection = traildetailsCollection;
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
        if (!(object instanceof Registrationdetails)) {
            return false;
        }
        Registrationdetails other = (Registrationdetails) object;
        if ((this.regNo == null && other.regNo != null) || (this.regNo != null && !this.regNo.equals(other.regNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sumaga.learnerssystem.dto.Registrationdetails[ regNo=" + regNo + " ]";
    }

}
