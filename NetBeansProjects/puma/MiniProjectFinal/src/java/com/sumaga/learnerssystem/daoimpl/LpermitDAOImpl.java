/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumaga.learnerssystem.daoimpl;

import com.sumaga.learnerssystem.dao.LPermitDAO;
import com.sumaga.learnerssystem.dto.Lpermit;
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
public class LpermitDAOImpl implements LPermitDAO{
    
    @Autowired
    SessionFactory factory;

    protected Session getSession() {
        return factory.openSession();
    }

    public boolean addLPermit(Lpermit lpermit) {
        Session openSession = getSession();
        openSession.beginTransaction();
        openSession.save(lpermit);
        openSession.getTransaction().commit();
        openSession.close();
        
       return true;
    }

    public boolean updateLPermit(Lpermit lpermit) {
        Session openSession = getSession();
        openSession.beginTransaction();
        openSession.update(lpermit);
        openSession.getTransaction().commit();
        openSession.close();
        
       return true;
    }

    public boolean deleteLPermit(Lpermit lpermit) {
        Session openSession = getSession();
        openSession.beginTransaction();
        openSession.delete(lpermit);
        openSession.getTransaction().commit();
        openSession.close();
        
       return true;
    }

    public Lpermit getLPermitByRegNo(String regNo) {//Lpermit.findByRegNo
        Session openSession = getSession();
        openSession.beginTransaction();
        Query namedQuery = openSession.getNamedQuery("Lpermit.findByRegNo");
        namedQuery.setString("regNo", regNo);
        Lpermit lpermit=(Lpermit) namedQuery.uniqueResult();
        openSession.getTransaction().commit();
        openSession.close();
        return lpermit;
        
    }

    public ArrayList<Lpermit> getLPermitByDate(Date date) {
        Session openSession = getSession();
        openSession.beginTransaction();
        Query namedQuery = openSession.getNamedQuery("Lpermit.findByIssueDate");
        namedQuery.setDate("date", date);
        List list = namedQuery.list();
        openSession.getTransaction().commit();
        openSession.close();
        return (ArrayList<Lpermit>) list;
    }

    public ArrayList<Lpermit> getExam() {
        Session openSession = getSession();
        openSession.beginTransaction();
        Query namedQuery = openSession.getNamedQuery("Lpermit.findAll");
        List list = namedQuery.list();
        openSession.getTransaction().commit();
        openSession.close();
        return (ArrayList<Lpermit>) list;
    }
    
}
