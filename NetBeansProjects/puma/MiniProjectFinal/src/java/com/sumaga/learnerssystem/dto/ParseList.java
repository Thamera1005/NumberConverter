/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumaga.learnerssystem.dto;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Thamira
 */
@Entity
public class ParseList implements Serializable {

    @Id
    private ArrayList<Exam> examList;

    public ArrayList<Exam> getExamList() {
        return examList;
    }

    public void setExamList(ArrayList<Exam> examList) {
        this.examList = examList;
    }
    
    
}
