/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumaga.learnerssystem.service;

import com.sumaga.learnerssystem.dao.*;
import com.sumaga.learnerssystem.dto.Personalaccount;
import java.util.ArrayList;

/**
 *
 * @author Thamira
 */
public interface PersonalAccountService {
    
    public boolean addAccont(Personalaccount account);
    public boolean updateAccount(Personalaccount account);
    public boolean deleteAccount(Personalaccount account);
    public Personalaccount getAccountByAccountNumberB(String regNo);
    public ArrayList<Personalaccount> getAccount();
    
}
