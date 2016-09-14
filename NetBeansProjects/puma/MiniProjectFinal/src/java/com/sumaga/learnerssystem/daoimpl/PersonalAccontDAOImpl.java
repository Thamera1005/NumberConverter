/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumaga.learnerssystem.daoimpl;

import com.sumaga.learnerssystem.dao.PersonalAccountDAO;
import com.sumaga.learnerssystem.dto.Personalaccount;
import com.sumaga.learnerssystem.service.RegistrationService;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.spi.RegisterableService;
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
public class PersonalAccontDAOImpl implements PersonalAccountDAO {

    @Autowired
    SessionFactory factory;
    
    @Autowired
    RegistrationService registerableService;

    protected Session getSession() {
        return factory.openSession();
    }

    public boolean addAccont(Personalaccount account) {
       Session session = getSession();
        session.beginTransaction();
        session.save(account);
        session.getTransaction().commit();
        session.close();

        return true;
    }

    public boolean updateAccount(Personalaccount account) {
        Session session = getSession();
        session.beginTransaction();
        session.update(account);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    public boolean deleteAccount(Personalaccount account) {
        Session seesion = getSession();
        seesion.beginTransaction();
        seesion.delete(account);
        seesion.getTransaction().commit();
        seesion.close();
        return true;
    }

    public Personalaccount getAccountByAccountNumberB(String regNo) {
        Session session = getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("Personalaccount.findByAccountNumberB");
        Personalaccount personalaccount=(Personalaccount) namedQuery.setString("accountNumberB", regNo);
        session.getTransaction().commit();
        session.close();
        return personalaccount;
    }

    public ArrayList<Personalaccount> getAccount() {
        Session session = getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("Personalaccount.findAll");
        List list = namedQuery.list();
        session.getTransaction().commit();
        session.close();
        return (ArrayList<Personalaccount>) list;
    }

}
