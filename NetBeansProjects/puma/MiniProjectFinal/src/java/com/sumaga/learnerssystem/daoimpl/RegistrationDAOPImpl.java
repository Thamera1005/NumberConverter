/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumaga.learnerssystem.daoimpl;

import com.sumaga.learnerssystem.dao.RegistrationDAO;
import com.sumaga.learnerssystem.dto.Registrationdetails;
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
public class RegistrationDAOPImpl implements RegistrationDAO {

    @Autowired
    SessionFactory sessionFactory;

    protected Session getSesson() {
        return sessionFactory.openSession();
    }

    public boolean addNewRegistration(Registrationdetails registrationdetails) {
        Session sesson = getSesson();
        sesson.beginTransaction();
        sesson.save(registrationdetails);
        sesson.getTransaction().commit();
        sesson.close();
        return true;
    }

    public boolean updatePerson(Registrationdetails registrationdetails) {
        Session sesson = getSesson();
        sesson.beginTransaction();
        sesson.update(registrationdetails);
        sesson.getTransaction().commit();
        sesson.close();
        return true;
    }

    public boolean deletePerson(Registrationdetails registrationdetails) {
        Session session = getSesson();
        session.beginTransaction();
        session.delete(registrationdetails);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    public ArrayList<Registrationdetails> getPerson() {
        Session session = getSesson();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("Registrationdetails.findAll");
        List<Registrationdetails> list = namedQuery.list();

        session.getTransaction().commit();
        session.close();
        return (ArrayList<Registrationdetails>) list;
    }

    public Registrationdetails getPerson(String regiNo) {
        Session session = getSesson();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("Registrationdetails.findByRegNo");
        namedQuery.setString("regNo", regiNo);
        Registrationdetails registrationdetails = (Registrationdetails) namedQuery.uniqueResult();
        session.getTransaction().commit();
        session.close();
        return registrationdetails;
    }

    public ArrayList<Registrationdetails> getPersonByDateRange(Date startDate, Date endDate) {
        Session session = getSesson();
        session.beginTransaction();
        Query createQuery = session.createQuery("SELECT r FROM Registrationdetails r WHERE r.day between :start and :end");
        createQuery.setParameter("start", startDate);
        createQuery.setParameter("end", endDate);
        List list = createQuery.list();

        return (ArrayList<Registrationdetails>) list;
    }

    public List<Registrationdetails> getRegNoBNotGoToExam() {
        Session openSession = getSesson();
        openSession.beginTransaction();
        Query createQuery = openSession.createQuery("SELECT r FROM Registrationdetails r where r.regNo not in (select e.regNo from Exam e)");
        List<Registrationdetails> list = createQuery.list();
        openSession.getTransaction().commit();
        openSession.close();
        return (List<Registrationdetails>) list;
    }

    public List<Registrationdetails> getPersonByNic(String nic) {
        Session openSession = getSesson();
        openSession.beginTransaction();
        Query createQuery = openSession.createQuery("SELECT r FROM Registrationdetails r where r.nic=:nic");
        createQuery.setParameter("nic", nic);
        List<Registrationdetails> list = createQuery.list();
        openSession.getTransaction().commit();
        openSession.close();
        return (List<Registrationdetails>) list;
    }

}
