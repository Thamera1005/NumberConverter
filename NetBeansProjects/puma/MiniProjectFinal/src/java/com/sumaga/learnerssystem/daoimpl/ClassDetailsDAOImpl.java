/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumaga.learnerssystem.daoimpl;

import com.sumaga.learnerssystem.dao.ClassDetailDAO;
import com.sumaga.learnerssystem.dto.Classdetails;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Thamira
 */
@Repository
public class ClassDetailsDAOImpl implements ClassDetailDAO {

    @Autowired
    SessionFactory factory;

    protected Session getSession() {
        return factory.openSession();
    }

    public boolean addClassDetail(Classdetails classdetails) {
        Session openSession = getSession();
        openSession.beginTransaction();
        openSession.save(classdetails);
        openSession.getTransaction().commit();
        openSession.close();

        return true;

    }

    public boolean updateClassDetail(Classdetails classdetails) {
        Session openSession = getSession();
        openSession.beginTransaction();
        openSession.update(classdetails);
        openSession.getTransaction().commit();
        openSession.close();

        return true;
    }

    public boolean deleteClassDetail(Classdetails classdetails) {
        Session openSession = getSession();
        openSession.beginTransaction();
        openSession.delete(classdetails);
        openSession.getTransaction().commit();
        openSession.close();

        return true;
    }

    public ArrayList<Classdetails> getClassDetailByRegNo(String regNo) {
        Session session=getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("Classdetails.findByRegNo");
        namedQuery.setString("regNo", regNo);
        List list = namedQuery.list();
        session.getTransaction().commit();
        session.close();
        
        return (ArrayList<Classdetails>) list;
    }

    public ArrayList<Classdetails> getClassDetailByDate(Date date) {
        Session session=getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("Classdetails.findByDate");
        namedQuery.setDate("date", date);
        List list = namedQuery.list();
        session.getTransaction().commit();
        session.close();
        return (ArrayList<Classdetails>) list;
    }

    public ArrayList<Classdetails> getClassDetail() {
        Session session=getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("Classdetails.findAll");
        List list = namedQuery.list();
        session.getTransaction().commit();
        session.close();
        return (ArrayList<Classdetails>) list;
    }

}
