/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumaga.learnerssystem.serviceimpl;

import com.sumaga.learnerssystem.dao.RegistrationDAO;
import com.sumaga.learnerssystem.dto.Registrationdetails;
import com.sumaga.learnerssystem.service.RegistrationService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Thamira
 */
@Service
public class RegistrationServiceImpl implements RegistrationService{
    
    @Autowired
    RegistrationDAO registrationDAO;

    public boolean addNewRegistration(Registrationdetails registrationdetails) {
        registrationDAO.addNewRegistration(registrationdetails);
        return true;
    }

    public boolean updatePerson(Registrationdetails registrationdetails) {
        registrationDAO.updatePerson(registrationdetails);
        return true;
    }

    public boolean deletePerson(Registrationdetails registrationdetails) {
        registrationDAO.deletePerson(registrationdetails);
        return true;
    }

    public Registrationdetails getPerson(String regiNo) {
        return registrationDAO.getPerson(regiNo);
        
    }

    public ArrayList<Registrationdetails> getPerson() {
        return registrationDAO.getPerson();
    }
    
    public ArrayList<Registrationdetails> getPersonByDateRange(Date startDate, Date endDate) {
        return registrationDAO.getPersonByDateRange(startDate, endDate);
    }

    public List<Registrationdetails> getRegNoBNotGoToExam() {
        return registrationDAO.getRegNoBNotGoToExam();
    }
    
    public List<Registrationdetails> getPersonByNic(String nic){
       return registrationDAO.getPersonByNic(nic);
    }

}
