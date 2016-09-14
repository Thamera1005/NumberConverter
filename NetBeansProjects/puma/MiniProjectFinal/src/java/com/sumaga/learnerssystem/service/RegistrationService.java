/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumaga.learnerssystem.service;

import com.sumaga.learnerssystem.dto.Registrationdetails;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Thamira
 */
public interface RegistrationService {
    
    public boolean addNewRegistration(Registrationdetails registrationdetails);

    public boolean updatePerson(Registrationdetails registrationdetails);

    public boolean deletePerson(Registrationdetails registrationdetails);

    public Registrationdetails getPerson(String regiNo);

    public ArrayList<Registrationdetails> getPerson();
    
    public ArrayList<Registrationdetails> getPersonByDateRange(Date startDate,Date endDate);
    public List<Registrationdetails> getRegNoBNotGoToExam();
    public List<Registrationdetails> getPersonByNic(String nic);
}
