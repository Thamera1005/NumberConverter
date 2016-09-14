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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Thamira
 */
@Entity
@Table(catalog = "lernersSql", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Classdetails.findAll", query = "SELECT c FROM Classdetails c"),
    @NamedQuery(name = "Classdetails.findByRegNo", query = "SELECT c FROM Classdetails c WHERE c.classdetailsPK.regNo = :regNo"),
    @NamedQuery(name = "Classdetails.findByLessonsNo", query = "SELECT c FROM Classdetails c WHERE c.classdetailsPK.lessonsNo = :lessonsNo"),
    @NamedQuery(name = "Classdetails.findByDate", query = "SELECT c FROM Classdetails c WHERE c.classdetailsPK.date = :date"),
    @NamedQuery(name = "Classdetails.findByDuration", query = "SELECT c FROM Classdetails c WHERE c.duration = :duration"),
    @NamedQuery(name = "Classdetails.findByMark", query = "SELECT c FROM Classdetails c WHERE c.mark = :mark")})
public class Classdetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ClassdetailsPK classdetailsPK;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.TIME)
    private Date duration;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private int mark;
    @JoinColumn(name = "regNo", referencedColumnName = "regNo", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Registrationdetails registrationdetails;
    @JoinColumn(name = "lessonsNo", referencedColumnName = "lessonsNo", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Lesson lesson;

    public Classdetails() {
    }

    public Classdetails(ClassdetailsPK classdetailsPK) {
        this.classdetailsPK = classdetailsPK;
    }

    public Classdetails(ClassdetailsPK classdetailsPK, Date duration, int mark) {
        this.classdetailsPK = classdetailsPK;
        this.duration = duration;
        this.mark = mark;
    }

    public Classdetails(String regNo, String lessonsNo, Date date) {
        this.classdetailsPK = new ClassdetailsPK(regNo, lessonsNo, date);
    }

    public ClassdetailsPK getClassdetailsPK() {
        return classdetailsPK;
    }

    public void setClassdetailsPK(ClassdetailsPK classdetailsPK) {
        this.classdetailsPK = classdetailsPK;
    }

    public Date getDuration() {
        return duration;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Registrationdetails getRegistrationdetails() {
        return registrationdetails;
    }

    public void setRegistrationdetails(Registrationdetails registrationdetails) {
        this.registrationdetails = registrationdetails;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (classdetailsPK != null ? classdetailsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Classdetails)) {
            return false;
        }
        Classdetails other = (Classdetails) object;
        if ((this.classdetailsPK == null && other.classdetailsPK != null) || (this.classdetailsPK != null && !this.classdetailsPK.equals(other.classdetailsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sumaga.learnerssystem.dto.Classdetails[ classdetailsPK=" + classdetailsPK + " ]";
    }
    
}
