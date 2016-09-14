
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
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class GetFormController {

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

    @RequestMapping(value = "addperson", method = RequestMethod.GET)
    public String getAddPersonForm(Model model) {
        Personaldetail personaldetail = new Personaldetail();
        model.addAttribute("account", personaldetail);
        return "pages/personview/addperson";
    }

    @RequestMapping(value = "searchPerson", method = RequestMethod.GET)
    public String getSerchPersonForm(Model model) {
        return "pages/personview/searchPerson";
    }

    @RequestMapping(value = "personaldetailedit", method = RequestMethod.POST, produces = "application/json")
    public String editPersonalDetail(HttpServletRequest hsr, Model model) {

        Personaldetail person = detailService.getPerson(hsr.getParameter("nic"));
        person.setRegistrationdetailsCollection(null);
        System.out.println(person);
        model.addAttribute("account", person);
        return "pages/personview/updateperson";
    }

    @RequestMapping(value = "allpersonpage", method = RequestMethod.GET)
    public String logAdmin() {
        return "pages/personview/allperson";

    }

    @RequestMapping(value = "viewperson", method = RequestMethod.GET)
    public String homex(Model model, HttpServletRequest request) {

        return "pages/personview/viewperson";
    }

    @RequestMapping(value = "newregistration", method = RequestMethod.GET)
    public String newRegistration(Model model, HttpServletRequest request) {
        Registrationdetails registrationdetails = new Registrationdetails();
        HttpSession session = request.getSession();
        session.setAttribute("ses", "hallo");
        model.addAttribute("registrationdto", registrationdetails);
        return "pages/registrationview/registrationform";

    }

    @RequestMapping(value = "regdetailedit", method = RequestMethod.POST, produces = "application/json")
    public String editRegistration(Model model, HttpServletRequest request) {

        Registrationdetails registrationdetails = registrationService.getPerson(request.getParameter("reg"));
        HttpSession session = request.getSession();
        session.setAttribute("ses", "hallo");
        model.addAttribute("registrationdto", registrationdetails);
        return "pages/registrationview/registrationformUpdate";

    }

    @RequestMapping(value = "searchRegistration", method = RequestMethod.GET)
    public String getSerchRegistrationForm(Model model) {
        return "pages/registrationview/searchPerson";
    }

    @RequestMapping(value = "loadSearch", method = RequestMethod.GET)
    public String loadSerchAccount(Model model) {
        return "pages/account/loadSearch";
    }

    @RequestMapping(value = "addAcount", method = RequestMethod.GET)
    public String getAccount(Model model, HttpServletRequest request) {
        Registrationdetails person = registrationService.getPerson(request.getParameter("regisNo"));
        System.out.println(person);
        if (person != null) {
            Account account = new Account(request.getParameter("regisNo"));
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM");
            java.util.Date date = new java.util.Date();
            account.setAccountNumberA("AC/" + dateFormat.format(date) + "/" + request.getParameter("regisNo"));
            model.addAttribute("account", account);
            System.out.println(account.getRegNo());
            return "pages/account/addAccount";
        }
        return "null";

    }

    @RequestMapping(value = "addAcountQuart", method = RequestMethod.GET)
    public String loadSerchloadSearchforQuarts(Model model) {
        return "pages/quartPay/loadSearch";
    }

    @RequestMapping(value = "accountNumberB", method = RequestMethod.GET)
    public String getAccountB(Model model, HttpServletRequest request) {
        try {
            Registrationdetails person = registrationService.getPerson(request.getParameter("regisNo"));
            Account account = person.getAccount();
            Personalaccount personalaccount = new Personalaccount();
            personalaccount.setAccountNumberA(account);
            HttpSession session = request.getSession();
            session.setAttribute("currentAccount", account);
            personalaccount.setAccountNumberB("16/7/1995");
            personalaccount.setAmount(1212);
            personalaccount.setDate(new Date(2016, 1, 20));
            model.addAttribute("account", personalaccount);
            return "pages/quartPay/addQuart";
        } catch (Exception e) {

        }
        return "null";
    }

    @RequestMapping(value = "getRegNoBNotGoToExam", method = RequestMethod.GET)
    public String getRegNoBNotGoToExam(Model model) {

        try {
            List<Registrationdetails> regNoBNotGoToExam = registrationService.getRegNoBNotGoToExam();
            for (Registrationdetails registrationdetails : regNoBNotGoToExam) {
                Personaldetail nic = registrationdetails.getNic();
                nic.setRegistrationdetailsCollection(null);
                registrationdetails.setExam(null);
                registrationdetails.setTraildetailsCollection(null);
                registrationdetails.setClassdetailsCollection(null);
                registrationdetails.setAccount(null);
            }
            Model addAttribute = model.addAttribute("examList", regNoBNotGoToExam);
            return "pages/exam/Exam";
        } catch (Exception e) {

        }
        return "null";
    }

    @RequestMapping(value = "getExamTimetable", method = RequestMethod.GET, produces = "application/json")
    public String getExamListTable(HttpServletRequest request, Model m) {

        HttpSession session = request.getSession();
        if (session.getAttribute("examListAllocated") == null) {
            String reg = request.getParameter("reg");
            Registrationdetails person = registrationService.getPerson(reg);
            Personaldetail nic = person.getNic();
            Map<String, Personaldetail> map = new HashMap<String, Personaldetail>();
            ArrayList<Personaldetail> al = new ArrayList<Personaldetail>();
            map.put(reg, nic);
            session.setAttribute("examListAllocated", map);
            al.add(nic);
            m.addAttribute("examListAllocatedModel", al);

        } else {
            String reg = request.getParameter("reg");
            Map<String, Personaldetail> map = (Map<String, Personaldetail>)session.getAttribute("examListAllocated");
            if (!map.containsKey(reg)) {
                Registrationdetails person = registrationService.getPerson(reg);
                Personaldetail nic = person.getNic();
                map.put(reg, nic);

            }
            ArrayList<Personaldetail> al = new ArrayList<Personaldetail>();
            Set<String> keySet = map.keySet();
            for (String string : keySet) {
                al.add(map.get(string));
            }
            session.setAttribute("examListAllocated", map);
            m.addAttribute("examListAllocatedModel", al);

        }

        return "pages/exam/ExamList";

    }
    @RequestMapping(value = "addMaekForExam", method = RequestMethod.GET, produces = "application/json")
    public String addMarkforExam() {



        return "pages/exam/Results";

    }
    @RequestMapping(value = "addMakeForExam", method = RequestMethod.POST, produces = "application/json")
    public String addMakeForExam(HttpServletRequest request, Model m) {

        String parameter = request.getParameter("date");
        DateFormat dateFormat=new SimpleDateFormat("mm/DD/yyyy");
        try {
            java.util.Date stratDate = dateFormat.parse(parameter.split(" - ")[0]);
            java.util.Date end = dateFormat.parse(parameter.split(" - ")[1]);
            
            ArrayList<Exam> examByBetweenDays = examService.getExamByBetweenDays(stratDate, end);
            m.addAttribute("examByBetweenDays", examByBetweenDays);
            
        } catch (ParseException ex) {
            Logger.getLogger(GetFormController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "pages/exam/examByBetweenDays";

    }

}
