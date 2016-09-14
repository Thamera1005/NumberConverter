
package com.sumaga.learnerssystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class PageLoadController {

    @RequestMapping(value = "adminPanal", method = RequestMethod.GET)
    public String adminHomePage() {
        
        return "AdminPanal";
    }
    @RequestMapping(value = "selectDate", method = RequestMethod.GET)
    public String addList() {
        
        return "AdminPanal";
    }
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login() {
        
        return "pages/userspage/loginpage";
    }
   
 
    
    
}
