/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumaga.learnerssystem.dao;

import com.sumaga.learnerssystem.dto.Exam;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Thamira
 */
public interface ExamDAO {
    public boolean addExam(Exam exam);
    public boolean updateExam(Exam exam);
    public boolean deleteExam(Exam exam);
    public Exam getExamByRegNo(String regNo);
    public ArrayList<Exam> getExamByDate(Date date);
    public ArrayList<Exam> getExam();
    public ArrayList<Exam> getExamByBetweenDays(Date startDate, Date endDate);
    public ArrayList<Exam> getExamByDay(Date startDate);
}
