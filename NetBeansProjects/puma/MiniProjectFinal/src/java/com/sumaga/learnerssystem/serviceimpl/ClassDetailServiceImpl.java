/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumaga.learnerssystem.serviceimpl;

import com.sumaga.learnerssystem.dao.ClassDetailDAO;
import com.sumaga.learnerssystem.dto.Classdetails;
import com.sumaga.learnerssystem.service.ClassDetailService;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Thamira
 */
@Service
public class ClassDetailServiceImpl implements ClassDetailService {

    @Autowired
    ClassDetailDAO detailDAO;

    public boolean addClassDetail(Classdetails classdetails) {
        return detailDAO.addClassDetail(classdetails);
    }

    public boolean updateClassDetail(Classdetails classdetails) {
        return detailDAO.deleteClassDetail(classdetails);
    }

    public boolean deleteClassDetail(Classdetails classdetails) {
        return detailDAO.deleteClassDetail(classdetails);
    }

    public ArrayList<Classdetails> getClassDetailByRegNo(String regNo) {
        return detailDAO.getClassDetailByRegNo(regNo);
    }

    public ArrayList<Classdetails> getClassDetailByDate(Date date) {
        return detailDAO.getClassDetailByDate(date);
    }

    public ArrayList<Classdetails> getClassDetail() {
        return detailDAO.getClassDetail();
    }

}
