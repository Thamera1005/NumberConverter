/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumaga.learnerssystem.service;

import com.sumaga.learnerssystem.dto.Classdetails;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Thamira
 */
public interface ClassDetailService {

    public boolean addClassDetail(Classdetails classdetails);

    public boolean updateClassDetail(Classdetails classdetails);

    public boolean deleteClassDetail(Classdetails classdetails);

    public ArrayList<Classdetails> getClassDetailByRegNo(String regNo);

    public ArrayList<Classdetails> getClassDetailByDate(Date date);

    public ArrayList<Classdetails> getClassDetail();

}
