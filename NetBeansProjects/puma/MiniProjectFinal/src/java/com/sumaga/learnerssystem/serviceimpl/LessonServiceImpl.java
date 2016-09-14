/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumaga.learnerssystem.serviceimpl;

import com.sumaga.learnerssystem.dao.LessonDAO;
import com.sumaga.learnerssystem.dto.Lesson;
import com.sumaga.learnerssystem.service.LessonService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Thamira
 */
@Service
public class LessonServiceImpl implements LessonService{
    
    @Autowired
    LessonDAO lessonDAO;
    public boolean addLesson(Lesson lesson) {
        return lessonDAO.addLesson(lesson);
    }

    public boolean updateLesson(Lesson lesson) {
        return lessonDAO.updateLesson(lesson);
    }

    public boolean deleteLesson(Lesson lesson) {
        return lessonDAO.deleteLesson(lesson);
    }

    public Lesson getLessonByLessonsNo(String lessonsNo) {
        return lessonDAO.getLessonByLessonsNo(lessonsNo);
    }

    public ArrayList<Lesson> getLesson() {
        return lessonDAO.getLesson();
    }
    
}
