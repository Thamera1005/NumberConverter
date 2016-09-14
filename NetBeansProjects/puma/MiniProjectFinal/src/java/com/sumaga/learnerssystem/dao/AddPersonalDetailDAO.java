/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumaga.learnerssystem.dao;

import com.sumaga.learnerssystem.dto.Personaldetail;
import java.util.ArrayList;
import org.springframework.dao.DataIntegrityViolationException;

/**
 *
 * @author Thamira
 */
public interface AddPersonalDetailDAO {
    
    public boolean addPerson(Personaldetail personaldetail)throws DataIntegrityViolationException;
    public boolean updatePerson(Personaldetail personaldetail);
    public boolean deletePerson(Personaldetail personaldetail);
    public Personaldetail getPerson(String nic);
    public Personaldetail getPersonByName(String name);
    public ArrayList<Personaldetail> getPerson();
    
    
}
