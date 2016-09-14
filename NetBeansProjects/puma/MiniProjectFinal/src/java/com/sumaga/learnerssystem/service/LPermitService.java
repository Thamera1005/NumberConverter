/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumaga.learnerssystem.service;

import com.sumaga.learnerssystem.dao.*;
import com.sumaga.learnerssystem.dto.Lpermit;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Thamira
 */
public interface LPermitService {
    public boolean addLPermit(Lpermit lpermit);
    public boolean updateLPermit(Lpermit lpermit);
    public boolean deleteLPermit(Lpermit lpermit);
    public Lpermit getLPermitByRegNo(String regNo);
    public ArrayList<Lpermit> getLPermitByDate(Date date);
    public ArrayList<Lpermit> getExam();
    
}
