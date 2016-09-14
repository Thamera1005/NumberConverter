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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
    @NamedQuery(name = "Personaldetail.findAll", query = "SELECT p FROM Personaldetail p"),
    @NamedQuery(name = "Personaldetail.findByNic", query = "SELECT p FROM Personaldetail p WHERE p.nic = :nic"),
    @NamedQuery(name = "Personaldetail.findByFullName", query = "SELECT p FROM Personaldetail p WHERE p.fullName = :fullName"),
    @NamedQuery(name = "Personaldetail.findByShortName", query = "SELECT p FROM Personaldetail p WHERE p.shortName = :shortName"),
    @NamedQuery(name = "Personaldetail.findByAge", query = "SELECT p FROM Personaldetail p WHERE p.age = :age"),
    @NamedQuery(name = "Personaldetail.findByAddress", query = "SELECT p FROM Personaldetail p WHERE p.address = :address"),
    @NamedQuery(name = "Personaldetail.findByMobileNumber", query = "SELECT p FROM Personaldetail p WHERE p.mobileNumber = :mobileNumber"),
    @NamedQuery(name = "Personaldetail.findBySex", query = "SELECT p FROM Personaldetail p WHERE p.sex = :sex"),
    @NamedQuery(name = "Personaldetail.findByBirthDay", query = "SELECT p FROM Personaldetail p WHERE p.birthDay = :birthDay"),
    @NamedQuery(name = "Personaldetail.findByHeight", query = "SELECT p FROM Personaldetail p WHERE p.height = :height"),
    @NamedQuery(name = "Personaldetail.findByWeight", query = "SELECT p FROM Personaldetail p WHERE p.weight = :weight"),
    @NamedQuery(name = "Personaldetail.findByBloodGroup", query = "SELECT p FROM Personaldetail p WHERE p.bloodGroup = :bloodGroup")})
public class Personaldetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(nullable = false, length = 20)
    private String nic;
    @Size(max = 100)
    @Column(length = 100)
    private String fullName;
    @Size(max = 30)
    @Column(length = 30)
    private String shortName;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private int age;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(nullable = false, length = 100)
    private String address;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(nullable = false, length = 15)
    private String mobileNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(nullable = false, length = 6)
    private String sex;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date birthDay;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private int height;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private int weight;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(nullable = false, length = 3)
    private String bloodGroup;
    @OneToMany(mappedBy = "nic", fetch = FetchType.EAGER)
    private Collection<Registrationdetails> registrationdetailsCollection;

    public Personaldetail() {
    }

    public Personaldetail(String nic) {
        this.nic = nic;
    }

    public Personaldetail(String nic, int age, String address, String mobileNumber, String sex, Date birthDay, int height, int weight, String bloodGroup) {
        this.nic = nic;
        this.age = age;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.sex = sex;
        this.birthDay = birthDay;
        this.height = height;
        this.weight = weight;
        this.bloodGroup = bloodGroup;
    }

    @JsonProperty("nic")
    public String getNic() {
        return nic;
    }

    @JsonProperty("nic")
    public void setNic(String nic) {
        this.nic = nic;
    }

    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @JsonProperty("shortName")
    public String getShortName() {
        return shortName;
    }

    @JsonProperty("shortName")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @JsonProperty("age")
    public int getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(int age) {
        this.age = age;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("mobileNumber")
    public String getMobileNumber() {
        return mobileNumber;
    }

    @JsonProperty("mobileNumber")
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @JsonProperty("sex")
    public String getSex() {
        return sex;
    }

    @JsonProperty("sex")
    public void setSex(String sex) {
        this.sex = sex;
    }

    @JsonProperty("birthDay")
    public Date getBirthDay() {
        return birthDay;
    }

    @JsonProperty("birthDay")
    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @JsonProperty("height")
    public int getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(int height) {
        this.height = height;
    }

    @JsonProperty("weight")
    public int getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @JsonProperty("bloodGroup")
    public String getBloodGroup() {
        return bloodGroup;
    }

    @JsonProperty("bloodGroup")
    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    @XmlTransient
    public Collection<Registrationdetails> getRegistrationdetailsCollection() {
        return registrationdetailsCollection;
    }

    public void setRegistrationdetailsCollection(Collection<Registrationdetails> registrationdetailsCollection) {
        this.registrationdetailsCollection = registrationdetailsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nic != null ? nic.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personaldetail)) {
            return false;
        }
        Personaldetail other = (Personaldetail) object;
        if ((this.nic == null && other.nic != null) || (this.nic != null && !this.nic.equals(other.nic))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sumaga.learnerssystem.dto.Personaldetail[ nic=" + nic + " ]";
    }

}
