/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumaga.learnerssystem.serviceimpl;

import com.sumaga.learnerssystem.dao.AccountDetailDAO;
import com.sumaga.learnerssystem.dto.Account;
import com.sumaga.learnerssystem.service.AccountService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Thamira
 */
@Service
public class AccountServiceImpl implements AccountService{
    
    @Autowired
    AccountDetailDAO detailDAO;

    public boolean addAccont(Account account) {
        return detailDAO.addAccont(account);
    }

    public boolean updateAccount(Account account) {
        return detailDAO.updateAccount(account);
    }

    public boolean deleteAccount(Account account) {
        return detailDAO.deleteAccount(account);
    }

    public Account getAccountByregNo(String regNo) {
        
        return detailDAO.getAccountByregNo(regNo);
    }

    public Account getAccountbyAccountNo(String accountNo) {
       return detailDAO.getAccountbyAccountNo(accountNo);
    }

    public ArrayList<Account> getAccount() {
        return detailDAO.getAccount();
    }
    
}
