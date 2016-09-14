/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumaga.learnerssystem.dto;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
    @NamedQuery(name = "Lesson.findAll", query = "SELECT l FROM Lesson l"),
    @NamedQuery(name = "Lesson.findByLessonsNo", query = "SELECT l FROM Lesson l WHERE l.lessonsNo = :lessonsNo"),
    @NamedQuery(name = "Lesson.findByDetail", query = "SELECT l FROM Lesson l WHERE l.detail = :detail")})
public class Lesson implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(nullable = false, length = 3)
    private String lessonsNo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(nullable = false, length = 100)
    private String detail;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lesson", fetch = FetchType.EAGER)
    private Collection<Classdetails> classdetailsCollection;

    public Lesson() {
    }

    public Lesson(String lessonsNo) {
        this.lessonsNo = lessonsNo;
    }

    public Lesson(String lessonsNo, String detail) {
        this.lessonsNo = lessonsNo;
        this.detail = detail;
    }

    public String getLessonsNo() {
        return lessonsNo;
    }

    public void setLessonsNo(String lessonsNo) {
        this.lessonsNo = lessonsNo;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @XmlTransient
    public Collection<Classdetails> getClassdetailsCollection() {
        return classdetailsCollection;
    }

    public void setClassdetailsCollection(Collection<Classdetails> classdetailsCollection) {
        this.classdetailsCollection = classdetailsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lessonsNo != null ? lessonsNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lesson)) {
            return false;
        }
        Lesson other = (Lesson) object;
        if ((this.lessonsNo == null && other.lessonsNo != null) || (this.lessonsNo != null && !this.lessonsNo.equals(other.lessonsNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sumaga.learnerssystem.dto.Lesson[ lessonsNo=" + lessonsNo + " ]";
    }
    
}
