/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumaga.learnerssystem.serviceimpl;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import com.sumaga.learnerssystem.dao.AddPersonalDetailDAO;
import com.sumaga.learnerssystem.dto.Personaldetail;
import com.sumaga.learnerssystem.service.PersonDetailService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Thamira
 */
@Service
@Transactional
public class PersonalDetailServiceImpl implements PersonDetailService{
    @Autowired
    AddPersonalDetailDAO dAO;
    public boolean addPerson(Personaldetail personaldetail) throws DataIntegrityViolationException{
        return dAO.addPerson(personaldetail);
    }

    public boolean updatePerson(Personaldetail personaldetail) {
       return dAO.updatePerson(personaldetail);
    }

    public boolean deletePerson(Personaldetail personaldetail) {
        return dAO.deletePerson(personaldetail);
    }

    public Personaldetail getPerson(String nic) {
        return dAO.getPerson(nic);
    }

    public ArrayList<Personaldetail> getPerson() {
        return dAO.getPerson();
    }
    
}
