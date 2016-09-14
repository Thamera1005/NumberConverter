/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumaga.learnerssystem.dao;

import com.sumaga.learnerssystem.dto.Lesson;
import java.util.ArrayList;

/**
 *
 * @author Thamira
 */
public interface LessonDAO {
    
    public boolean addLesson(Lesson lesson);
    public boolean updateLesson(Lesson lesson);
    public boolean deleteLesson(Lesson lesson);
    public Lesson getLessonByLessonsNo(String lessonsNo);
    public ArrayList<Lesson> getLesson();
    
}
