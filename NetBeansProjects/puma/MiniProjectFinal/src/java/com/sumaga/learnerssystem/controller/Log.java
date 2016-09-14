/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumaga.learnerssystem.controller;

import com.sumaga.learnerssystem.dto.Account;
import com.sumaga.learnerssystem.dto.Exam;
import com.sumaga.learnerssystem.dto.Personaldetail;
import com.sumaga.learnerssystem.dto.Registrationdetails;
import com.sumaga.learnerssystem.service.AccountService;
import com.sumaga.learnerssystem.service.ExamService;
import com.sumaga.learnerssystem.service.PersonDetailService;
import com.sumaga.learnerssystem.service.RegistrationService;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Thamira
 */
@Controller
@RequestMapping(value = "/")
public class Log {

    @Autowired
    PersonDetailService detailService;

    @Autowired
    RegistrationService registrationService;

    @Autowired
    AccountService accountManage;

    @Autowired
    ExamService examService;

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String logIn(Model model, HttpServletRequest request) {
        String nic = request.getParameter("nic");
        String password = request.getParameter("regno");
        System.out.println(nic + "  " + password);
        if (nic != "" && password != "") {
            Personaldetail personaldetail = detailService.getPerson(nic);
            Registrationdetails person = registrationService.getPerson(password);
            System.out.println(person);

            if (person != null && personaldetail != null) {
                System.out.println(person);
                HttpSession session = request.getSession();
                session.setAttribute("registration", person);

                return "UserPanal";
            }
            return "../../index";
        }

        return "../../index";
    }

    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String home(Model model, HttpServletRequest request) {
        Personaldetail personaldetail = new Personaldetail();
        personaldetail.setNic("912082091V");
        model.addAttribute("account", personaldetail);
        return "AdminPanal";
    }

    @RequestMapping(value = "AdminLog", method = RequestMethod.GET)
    public String logAdmin(Model model, HttpServletRequest request) {

        String name = request.getParameter("name");
        String password = request.getParameter("password");
        System.out.println(name + password);
        if (name.equals("Thamira") && password.equals("Thamira")) {
            Personaldetail personaldetail = new Personaldetail();
            model.addAttribute("personaldetail", personaldetail);
            return "AdminPanal";
        }

        return "../";

    }
    
    @RequestMapping(value = "admin", method = RequestMethod.GET)
    public String admin(Model model, HttpServletRequest request) {

        return "pages/userview/SingUpAdmin";
    }

    @RequestMapping(value = "q", method = RequestMethod.GET)
    public String q() {

        return "test";

    }

}
