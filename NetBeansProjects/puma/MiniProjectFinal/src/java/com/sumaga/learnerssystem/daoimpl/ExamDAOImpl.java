/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumaga.learnerssystem.daoimpl;

import com.sumaga.learnerssystem.dao.ExamDAO;
import com.sumaga.learnerssystem.dto.Exam;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
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
public class ExamDAOImpl implements ExamDAO {

    @Autowired
    SessionFactory factory;

    protected Session getSession() {
        return factory.openSession();
    }

    public boolean addExam(Exam exam) {
        Session openSession = getSession();
        openSession.beginTransaction();
        openSession.save(exam);
        openSession.getTransaction().commit();
        openSession.close();

        return true;
    }

    public boolean updateExam(Exam exam) {
        Session openSession = getSession();
        openSession.beginTransaction();
        openSession.update(exam);
        openSession.getTransaction().commit();
        openSession.close();

        return true;
    }

    public boolean deleteExam(Exam exam) {
        Session openSession = getSession();
        openSession.beginTransaction();
        openSession.delete(exam);
        openSession.getTransaction().commit();
        openSession.close();

        return true;
    }

    public Exam getExamByRegNo(String regNo) {
        Session openSession = getSession();
        openSession.beginTransaction();
        Query namedQuery = openSession.getNamedQuery("Exam.findByRegNo");
        namedQuery.setString("regNo", regNo);
        Exam exam = (Exam) namedQuery.uniqueResult();
        openSession.getTransaction().commit();
        openSession.close();
        return exam;

    }

    public ArrayList<Exam> getExamByDate(Date date) {
        Session openSession = getSession();
        openSession.beginTransaction();
        Query namedQuery = openSession.getNamedQuery("Exam.findByDate");
        namedQuery.setParameter("date", date);
        List list = namedQuery.list();
        openSession.getTransaction().commit();
        openSession.close();
        return (ArrayList<Exam>) list;
    }

    public ArrayList<Exam> getExam() {
        Session openSession = getSession();
        openSession.beginTransaction();
        Query namedQuery = openSession.getNamedQuery("Exam.findAll");
        List list = namedQuery.list();
        openSession.getTransaction().commit();
        openSession.close();
        return (ArrayList<Exam>) list;
    }

    public ArrayList<Exam> getExamByBetweenDays(Date startDate, Date endDate) {
        Session openSession = getSession();
        openSession.beginTransaction();
        Query createQuery = openSession.createQuery("SELECT DISTINCT e FROM Exam e WHERE e.date between :start and :end group by e.date");
        createQuery.setParameter("start", startDate);
        createQuery.setParameter("end", endDate);
        List list = createQuery.list();
        openSession.getTransaction().commit();
        openSession.close();
        return (ArrayList<Exam>) list;
    }

    public ArrayList<Exam> getExamByDay(Date startDate) {
        Session openSession = getSession();
        openSession.beginTransaction();
        Query createQuery = openSession.createQuery("SELECT DISTINCT e FROM Exam e WHERE e.date = :start group by e.date");
        createQuery.setParameter("start", startDate);
        List list = createQuery.list();
        openSession.getTransaction().commit();
        openSession.close();
        return (ArrayList<Exam>) list;
    }

}
