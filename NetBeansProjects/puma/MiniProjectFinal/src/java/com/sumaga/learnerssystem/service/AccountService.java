/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumaga.learnerssystem.service;

import com.sumaga.learnerssystem.dto.Account;
import java.util.ArrayList;

/**
 *
 * @author Thamira
 */
public interface AccountService {
    
    public boolean addAccont(Account account);
    public boolean updateAccount(Account account);
    public boolean deleteAccount(Account account);
    public Account getAccountByregNo(String regNo);
    public Account getAccountbyAccountNo(String accountNo);
    public ArrayList<Account> getAccount();
    
}
