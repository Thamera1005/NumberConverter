/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumaga.learnerssystem.dao;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import com.sumaga.learnerssystem.dto.Personalaccount;
import java.util.ArrayList;
import org.springframework.dao.DataIntegrityViolationException;

/**
 *
 * @author Thamira
 */
public interface PersonalAccountDAO {
    
    public boolean addAccont(Personalaccount account)throws DataIntegrityViolationException;
    public boolean updateAccount(Personalaccount account);
    public boolean deleteAccount(Personalaccount account);
    public Personalaccount getAccountByAccountNumberB(String regNo);
    public ArrayList<Personalaccount> getAccount();
    
}
