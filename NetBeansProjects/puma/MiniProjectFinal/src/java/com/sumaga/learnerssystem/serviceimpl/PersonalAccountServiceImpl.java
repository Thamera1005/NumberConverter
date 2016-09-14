/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumaga.learnerssystem.serviceimpl;

import com.sumaga.learnerssystem.dao.PersonalAccountDAO;
import com.sumaga.learnerssystem.dto.Personalaccount;
import com.sumaga.learnerssystem.service.PersonalAccountService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Thamira
 */
@Service
public class PersonalAccountServiceImpl implements PersonalAccountService{
    
    @Autowired
    PersonalAccountDAO personalAccountDAO;

    public boolean addAccont(Personalaccount account) {
        return personalAccountDAO.addAccont(account);
    }

    public boolean updateAccount(Personalaccount account) {
        return personalAccountDAO.updateAccount(account);
    }

    public boolean deleteAccount(Personalaccount account) {
        return personalAccountDAO.deleteAccount(account);
    }

    public Personalaccount getAccountByAccountNumberB(String regNo) {
        return personalAccountDAO.getAccountByAccountNumberB(regNo);
    }

    public ArrayList<Personalaccount> getAccount() {
        return personalAccountDAO.getAccount();
    }
    
}
