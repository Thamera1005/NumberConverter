/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumaga.learnerssystem.serviceimpl;

import com.sumaga.learnerssystem.dao.LPermitDAO;
import com.sumaga.learnerssystem.dto.Lpermit;
import com.sumaga.learnerssystem.service.LPermitService;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Thamira
 */
@Service
public class LPermitServiceImpl implements LPermitService{
    
    @Autowired
    LPermitDAO lPermitDAO;

    public boolean addLPermit(Lpermit lpermit) {
        return lPermitDAO.addLPermit(lpermit);
    }

    public boolean updateLPermit(Lpermit lpermit) {
        return lPermitDAO.updateLPermit(lpermit);
    }

    public boolean deleteLPermit(Lpermit lpermit) {
        return lPermitDAO.deleteLPermit(lpermit);
    }

    public Lpermit getLPermitByRegNo(String regNo) {
        return lPermitDAO.getLPermitByRegNo(regNo);
    }

    public ArrayList<Lpermit> getLPermitByDate(Date date) {
        return lPermitDAO.getLPermitByDate(date);
    }

    public ArrayList<Lpermit> getExam() {
        return lPermitDAO.getExam();
    }
    
}
