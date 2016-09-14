
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumaga.learnerssystem.daoimpl;

import com.sumaga.learnerssystem.dao.AccountDetailDAO;
import com.sumaga.learnerssystem.dto.Account;
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
public class AccountDetailDAOImpl  implements AccountDetailDAO {

    @Autowired
    SessionFactory factory;

    protected Session getSession() {
        return factory.openSession();
    }

    public boolean addAccont(Account account) {
        Session session = getSession();
        session.beginTransaction();
        session.save(account);
        session.getTransaction().commit();
        session.close();

        return true;
    }

    public boolean updateAccount(Account account) {
        Session session = getSession();
        session.beginTransaction();
        session.update(account);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    public boolean deleteAccount(Account account) {
        Session session = getSession();
        session.beginTransaction();
        session.delete(account);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    public Account getAccountByregNo(String regNo) {
        Session session = getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("Account.findByRegNo");
        namedQuery.setString("regNo", regNo);
        Account account = (Account) namedQuery.uniqueResult();
        session.getTransaction().commit();
        session.close();
        return account;
    }

    

    public ArrayList<Account> getAccount() {
        Session session=getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("Account.findAll");
        List<Account> list = namedQuery.list();
        
        session.getTransaction().commit();
        session.close();
        return (ArrayList<Account>) list;
    }

    

    public Account getAccountbyAccountNo(String accountNo) {
        Session session = getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("Account.findByAccountNumberA");
        namedQuery.setString("accountNumberA", accountNo);
        Account account = (Account) namedQuery.uniqueResult();
        session.getTransaction().commit();
        session.close();
        return new Account();
    }

}
