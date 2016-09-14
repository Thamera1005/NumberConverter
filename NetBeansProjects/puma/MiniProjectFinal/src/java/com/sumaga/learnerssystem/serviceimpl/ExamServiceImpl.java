/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumaga.learnerssystem.serviceimpl;

import com.sumaga.learnerssystem.dao.ExamDAO;
import com.sumaga.learnerssystem.dto.Exam;
import com.sumaga.learnerssystem.service.ExamService;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Thamira
 */
@Service
public class ExamServiceImpl implements ExamService{
    
    @Autowired
    ExamDAO examDAO;

    public boolean addExam(Exam exam) {
        return examDAO.addExam(exam);
    }

    public boolean updateExam(Exam exam) {
        return examDAO.updateExam(exam);
    }

    public boolean deleteExam(Exam exam) {
        return examDAO.deleteExam(exam);
    }

    public Exam getExamByRegNo(String regNo) {
        return examDAO.getExamByRegNo(regNo);
    }

    public ArrayList<Exam> getExamByDate(Date date) {
        return examDAO.getExamByDate(date);
    }

    public ArrayList<Exam> getExam() {
        return examDAO.getExam();
    }
    
    public ArrayList<Exam> getExamByBetweenDays(Date startDate, Date endDate){
        return examDAO.getExamByBetweenDays(startDate, endDate);
    }
    public ArrayList<Exam> getExamByDay(Date startDate){
        return examDAO.getExamByDate(startDate);
    }
}
