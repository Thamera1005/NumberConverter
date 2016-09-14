/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumaga.learnerssystem.dao;

import com.sumaga.learnerssystem.dto.Traildetails;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Thamira
 */
public interface TrailDetailDAO {
    public boolean addTrailDetail(Traildetails traildetails);
    public boolean updateTrailDetail(Traildetails traildetails);
    public boolean deleteTrailDetail(Traildetails traildetails);
    public Traildetails getTrailDetailByRegNo(String regNo);
    public ArrayList<Traildetails> getTrailDetailByDate(Date date);
    public ArrayList<Traildetails> getTrailDetail();
}
