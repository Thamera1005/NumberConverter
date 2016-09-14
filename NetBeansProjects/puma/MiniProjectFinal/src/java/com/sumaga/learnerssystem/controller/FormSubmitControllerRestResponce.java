package com.sumaga.learnerssystem.controller;

import com.sumaga.learnerssystem.dto.Account;
import com.sumaga.learnerssystem.dto.Exam;
import com.sumaga.learnerssystem.dto.Personalaccount;
import com.sumaga.learnerssystem.dto.Personaldetail;
import com.sumaga.learnerssystem.dto.Registrationdetails;
import com.sumaga.learnerssystem.service.AccountService;
import com.sumaga.learnerssystem.service.ExamService;
import com.sumaga.learnerssystem.service.PersonDetailService;
import com.sumaga.learnerssystem.service.PersonalAccountService;
import com.sumaga.learnerssystem.service.RegistrationService;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class FormSubmitControllerRestResponce {

    @Autowired
    PersonDetailService detailService;

    @Autowired
    RegistrationService registrationService;
    
    @Autowired
    AccountService accountService;
    
    @Autowired
    PersonalAccountService personalAccountService;
    
    @Autowired
    ExamService examService;
    @Autowired
    PersonalAccountService accountService1;

//    @RequestMapping(value = "nopage", method = RequestMethod.GET, produces = "application/json")
//    public @ResponseBody
//    String nullpage(Model model) {
//    return "{error:{'message':'nu'}}";
//    }
    @RequestMapping(value = "personaldetailAdd", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    Personaldetail addPersonalDetail(@RequestBody Personaldetail personaldetail, Model model) {

        try {
            detailService.addPerson(personaldetail);

        } catch (DataIntegrityViolationException e) {
            personaldetail.setNic("duplicate");
            return personaldetail;
        } catch (ConstraintViolationException e) {
            personaldetail.setNic("null");
            return personaldetail;
        }
        return personaldetail;
    }

    @RequestMapping(value = "personaldetailUpdate", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    Personaldetail updatePersonalDetail(@RequestBody Personaldetail personaldetail, Model model) {

        try {
            detailService.updatePerson(personaldetail);

        } catch (DataIntegrityViolationException e) {
            personaldetail.setNic("duplicate");
            return personaldetail;
        } catch (ConstraintViolationException e) {
            personaldetail.setNic("null");
            return personaldetail;
        }
        
        
        return personaldetail;
    }

    @RequestMapping(value = "personaldetailsearchbynic", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    Personaldetail searcgPersonalDetail(HttpServletRequest hsr) {

        try {
            Personaldetail person = detailService.getPerson(hsr.getParameter("nic"));
            person.setRegistrationdetailsCollection(null);
            return person;
        } catch (NullPointerException e) {

        }
        return null;
    }
    

    @RequestMapping(value = "personaldetaildelete", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    boolean deletePersonalDetail(HttpServletRequest hsr) {
        Personaldetail person = detailService.getPerson(hsr.getParameter("nic"));
        boolean deletePerson = detailService.deletePerson(person);
        return deletePerson;
    }

    @RequestMapping(value = "allperson", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    ArrayList<Personaldetail> getAllPersonalDetails(HttpServletRequest hsr) {
        ArrayList<Personaldetail> person = detailService.getPerson();
        for (Personaldetail personaldetail : person) {
            personaldetail.setRegistrationdetailsCollection(null);
        }
        return person;
    }
    
    @RequestMapping(value = "checkNic", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    Personaldetail checkNic(HttpServletRequest hsr) {
        System.out.println(hsr.getParameter("nic"));
        try {
            Personaldetail person = detailService.getPerson(hsr.getParameter("nic"));
            person.setRegistrationdetailsCollection(null);
            HttpSession session = hsr.getSession();
            session.setAttribute("currentNic", person);
            return person;
        } catch (NullPointerException e) {

        }
        return new Personaldetail();
    }

    @RequestMapping(value = "registrationdetailAdd", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    Registrationdetails registrationDetailAdd(@RequestBody Registrationdetails registrationdetails, Model model,HttpServletRequest hsr) {
        try {
             HttpSession session = hsr.getSession();
            
            Personaldetail nic = (Personaldetail) session.getAttribute("currentNic");
            System.out.println(nic);
            registrationdetails.setNic(nic);
            registrationService.addNewRegistration(registrationdetails);
            registrationdetails.setNic(null);
        } catch (DataIntegrityViolationException e) {

        } catch (ConstraintViolationException e) {

        }
        return registrationdetails;
    }

    @RequestMapping(value = "registrationdetailUpdatedatabase", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    Registrationdetails registrationDetailUpdateDatabase(@RequestBody Registrationdetails registrationdetails, Model model) {
        try {
            registrationService.updatePerson(registrationdetails);
        } catch (DataIntegrityViolationException e) {

        } catch (ConstraintViolationException e) {

        }
        return registrationdetails;
    }

    @RequestMapping(value = "registrationdetailUpdate", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    Registrationdetails registrationDetailUpdate(@RequestBody Registrationdetails registrationdetails, Model model) {
        try {
            registrationService.updatePerson(registrationdetails);
        } catch (DataIntegrityViolationException e) {
        } catch (ConstraintViolationException e) {
        }
        return registrationdetails;
    }

    @RequestMapping(value = "registrationdetailsearchbynic", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    Collection<Registrationdetails> searcgRegistrationDetail(HttpServletRequest hsr) {
        Personaldetail person = detailService.getPerson(hsr.getParameter("nic"));
        Collection<Registrationdetails> registrationdetailsCollection = person.getRegistrationdetailsCollection();
        for (Registrationdetails registrationdetails : registrationdetailsCollection) {
            registrationdetails.setNic(null);
            registrationdetails.setExam(null);
            registrationdetails.setTraildetailsCollection(null);
            registrationdetails.setClassdetailsCollection(null);
            registrationdetails.setAccount(null);
        }

        return registrationdetailsCollection;
    }

    @RequestMapping(value = "registrationserch", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    Registrationdetails sRegistrationDetail(HttpServletRequest hsr) {
        Registrationdetails registrationdetails = registrationService.getPerson(hsr.getParameter("reg"));
        registrationdetails.setNic(null);
        registrationdetails.setExam(null);
        registrationdetails.setTraildetailsCollection(null);
        registrationdetails.setClassdetailsCollection(null);
        registrationdetails.setAccount(null);

        return registrationdetails;
    }

    @RequestMapping(value = "registrationdetaildelete", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    boolean deleteRegistrationDetail(HttpServletRequest hsr) {
        Registrationdetails registrationdetails = registrationService.getPerson(hsr.getParameter("reg"));
        registrationdetails.setNic(null);
        registrationdetails.setExam(null);
        registrationdetails.setTraildetailsCollection(null);
        registrationdetails.setClassdetailsCollection(null);
        registrationdetails.setAccount(null);
        boolean registrationdetail = registrationService.deletePerson(registrationdetails);
        return registrationdetail;
    }

    @RequestMapping(value = "accountAddtoDb", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    Account addaccount(@RequestBody Account account, Model model) {
        try {
            accountService.addAccont(account);
             return account;
        } catch (DataIntegrityViolationException e) {
            return null;
        } catch (ConstraintViolationException e) {
            return null;
        }
        
    }
    @RequestMapping(value = "accountBAddtoDb", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    Personalaccount addBaccount(@RequestBody Personalaccount account, Model model,HttpServletRequest request) {
        try {
             HttpSession session = request.getSession();
             Account accounts=(Account) session.getAttribute("currentAccount");
             account.setAccountNumberA(accounts);
            accountService1.addAccont(account);
             return account;
        } catch (DataIntegrityViolationException e) {
            return null;
        } catch (ConstraintViolationException e) {
            return null;
        }
        
    }
    @RequestMapping(value = "addExamList", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    Personaldetail addBaccount(HttpServletRequest request) throws ParseException {
        String parameter = request.getParameter("selectDate");
        DateFormat dateFormat=new SimpleDateFormat("yyyy-mm-DD");
        
        Date date = dateFormat.parse(parameter);
        HttpSession session = request.getSession();
        Map<String, Personaldetail> map = (Map<String, Personaldetail>)session.getAttribute("examListAllocated");
        Set<String> keySet = map.keySet();
        for (String string : keySet) {
            Exam exam = new Exam(string, 0, new java.sql.Date(date.getYear(),date.getMonth(),date.getDate()));
            Registrationdetails person = registrationService.getPerson(string);
            exam.setRegistrationdetails(person);
            examService.addExam(exam);
             map.remove(string);
        }
       
        session.setAttribute("examListAllocated", map);
        return new Personaldetail();
    }

}
