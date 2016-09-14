/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumaga.learnerssystem.serviceimpl;

import com.sumaga.learnerssystem.dao.TrailDetailDAO;
import com.sumaga.learnerssystem.dto.Traildetails;
import com.sumaga.learnerssystem.service.TrailDetailService;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Thamira
 */
@Service
public class TrailDetailServiceImpl implements TrailDetailService{
    
    @Autowired
    TrailDetailDAO trailDetailDAO;

    public boolean addTrailDetail(Traildetails traildetails) {
        return trailDetailDAO.addTrailDetail(traildetails);
    }

    public boolean updateTrailDetail(Traildetails traildetails) {
        return trailDetailDAO.updateTrailDetail(traildetails);
    }

    public boolean deleteTrailDetail(Traildetails traildetails) {
        return trailDetailDAO.deleteTrailDetail(traildetails);
    }

    public Traildetails getTrailDetailByRegNo(String regNo) {
        return trailDetailDAO.getTrailDetailByRegNo(regNo);
    }

    public ArrayList<Traildetails> getTrailDetailByDate(Date date) {
        return trailDetailDAO.getTrailDetailByDate(date);
    }

    public ArrayList<Traildetails> getTrailDetail() {
        return trailDetailDAO.getTrailDetail();
    }
    
}
