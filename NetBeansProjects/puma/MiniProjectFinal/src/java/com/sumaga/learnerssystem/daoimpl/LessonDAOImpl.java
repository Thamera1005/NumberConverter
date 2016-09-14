
package com.sumaga.learnerssystem.daoimpl;

import com.sumaga.learnerssystem.dao.LessonDAO;
import com.sumaga.learnerssystem.dto.Lesson;
import java.util.ArrayList;
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
public class LessonDAOImpl implements LessonDAO{
    
    @Autowired
    SessionFactory factory;

    protected Session getSession() {
        return factory.openSession();
    }

    public boolean addLesson(Lesson lesson) {
        Session openSession = getSession();
        openSession.beginTransaction();
        openSession.save(lesson);
        openSession.getTransaction().commit();
        openSession.close();
        
       return true;
        
    }

    public boolean updateLesson(Lesson lesson) {
        Session openSession = getSession();
        openSession.beginTransaction();
        openSession.update(lesson);
        openSession.getTransaction().commit();
        openSession.close();
        
       return true;
    }

    public boolean deleteLesson(Lesson lesson) {
        Session openSession = getSession();
        openSession.beginTransaction();
        openSession.delete(lesson);
        openSession.getTransaction().commit();
        openSession.close();
        
       return true;
    }

    public Lesson getLessonByLessonsNo(String lessonsNo) {
        Session openSession = getSession();
        openSession.beginTransaction();
        Query namedQuery = openSession.getNamedQuery("Lesson.findByLessonsNo");
        namedQuery.setString("lessonsNo", lessonsNo);
        Lesson lesson=(Lesson) namedQuery.uniqueResult();
        openSession.getTransaction().commit();
        openSession.close();
        
       return lesson;
    }

    public ArrayList<Lesson> getLesson() {
        Session openSession = getSession();
        openSession.beginTransaction();
        Query namedQuery = openSession.getNamedQuery("Lesson.findAll");
        List list = namedQuery.list();
        openSession.getTransaction().commit();
        openSession.close();
        
       return (ArrayList<Lesson>) list;
    }
    
}
