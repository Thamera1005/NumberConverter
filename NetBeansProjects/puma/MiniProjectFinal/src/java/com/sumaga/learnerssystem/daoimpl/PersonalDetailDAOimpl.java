/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumaga.learnerssystem.daoimpl;

import com.sumaga.learnerssystem.dao.AddPersonalDetailDAO;
import com.sumaga.learnerssystem.dto.Personaldetail;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Thamira
 */

@Repository
public class PersonalDetailDAOimpl implements AddPersonalDetailDAO{
    
    @Autowired
    private SessionFactory sessionFactory;
    private Session openSession=null;
    
    protected Session getSeesion(){
        
        
       return sessionFactory.openSession();
    }
 

    public boolean addPerson(Personaldetail personaldetail)throws DataIntegrityViolationException{
        HibernateTemplate hibernateTemplate=new HibernateTemplate(sessionFactory);
        hibernateTemplate.save(personaldetail);
        return true;
    }

    public boolean updatePerson(Personaldetail personaldetail) {
        Session seesion = getSeesion();
        seesion.beginTransaction();
        seesion.update(personaldetail);
        seesion.getTransaction().commit();
        seesion.close();
        return true;
    }

    public boolean deletePerson(Personaldetail personaldetail) {
        Session seesion = getSeesion();
        seesion.beginTransaction();
        seesion.delete(personaldetail);
        seesion.getTransaction().commit();
        seesion.close();
        return true;
    }

    public Personaldetail getPerson(String nic) {
        Personaldetail personaldetail = null;
        Session seesion = getSeesion();
        seesion.beginTransaction();
        Query namedQuery = seesion.getNamedQuery("Personaldetail.findByNic");
        namedQuery.setString("nic", nic);
        personaldetail=(Personaldetail) namedQuery.uniqueResult();
        seesion.getTransaction().commit();
        seesion.close();
        return personaldetail;
    }
    public Personaldetail getPersonByName(String name) {
        Personaldetail personaldetail = null;
        Session seesion = getSeesion();
        seesion.beginTransaction();
        Query namedQuery = seesion.getNamedQuery("Personaldetail.findByShortName");
        namedQuery.setString("shortName", name);
        personaldetail=(Personaldetail) namedQuery.uniqueResult();
        seesion.getTransaction().commit();
        seesion.close();
        return personaldetail;
    }

    public ArrayList<Personaldetail> getPerson() {
        Personaldetail personaldetail = null;
        Session seesion = getSeesion();
        seesion.beginTransaction();
        Query namedQuery = seesion.getNamedQuery("Personaldetail.findAll");
        List<Personaldetail> list = namedQuery.list();
        seesion.getTransaction().commit();
        seesion.close();
        return (ArrayList<Personaldetail>) list;
    }
    
}
