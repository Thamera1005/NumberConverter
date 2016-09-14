package com.sumaga.learnerssystem.daoimpl;


import com.sumaga.learnerssystem.dao.TrailDetailDAO;
import com.sumaga.learnerssystem.dto.Traildetails;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thamira
 */
@Repository
public class TrailDetailDAOImpl implements TrailDetailDAO{
    
    @Autowired
    SessionFactory sessionFactory;
   
    
    protected Session getSesson(){
        return sessionFactory.openSession();
    }

    public boolean addTrailDetail(Traildetails traildetails) {
        Session sesson = getSesson();
        sesson.beginTransaction();
        sesson.save(traildetails);
        sesson.getTransaction().commit();
        sesson.close();
        return true;
    }

    public boolean updateTrailDetail(Traildetails traildetails) {
        Session sesson = getSesson();
        sesson.beginTransaction();
        sesson.update(traildetails);
        sesson.getTransaction().commit();
        sesson.close();
        return true;
    }

    public boolean deleteTrailDetail(Traildetails traildetails) {
        Session sesson = getSesson();
        sesson.beginTransaction();
        sesson.delete(traildetails);
        sesson.getTransaction().commit();
        sesson.close();
        return true;
    }

    public Traildetails getTrailDetailByRegNo(String regNo) {
        Session sesson = getSesson();
        sesson.beginTransaction();
        Query namedQuery = sesson.getNamedQuery("Traildetails.findByRegNo");
        namedQuery.setString("regNo", regNo);
        Traildetails traildetails=(Traildetails) namedQuery.uniqueResult();
        sesson.getTransaction().commit();
        sesson.close();
        return traildetails;
    }

    public ArrayList<Traildetails> getTrailDetailByDate(Date date) {
        Session sesson = getSesson();
        sesson.beginTransaction();
        Query namedQuery = sesson.getNamedQuery("Traildetails.findByDate");
        List list = namedQuery.list();
        sesson.getTransaction().commit();
        sesson.close();
        return (ArrayList<Traildetails>) list;
    }

    public ArrayList<Traildetails> getTrailDetail() {
        Session sesson = getSesson();
        sesson.beginTransaction();
        Query namedQuery = sesson.getNamedQuery("Traildetails.findAll");
        List list = namedQuery.list();
        sesson.getTransaction().commit();
        sesson.close();
        return (ArrayList<Traildetails>) list;
    }
    
}
