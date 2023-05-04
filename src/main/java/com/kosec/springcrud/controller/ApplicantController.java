package com.kosec.springcrud.controller;


import java.util.*;
import java.util.Optional;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kosec.springcrud.model.Applicant;
import com.kosec.springcrud.service.ApplicantService;


@Controller
public class ApplicantController {
    
    @Autowired
    private ApplicantService applicantService;
    
    @GetMapping("/")
    public String viewMainPage(Model model){
        return "Navbar";
    }
    
    @GetMapping("/home")
    public String viewHomePage(Model model){
        model.addAttribute("listApplicants", applicantService.getAllApplicants());
        return "index";
    }
    
    
    @GetMapping("/showNewApplicantForm")
    public String showNewApplicantForm(Model model) {
        Applicant applicant = new Applicant();
        model.addAttribute("applicant", applicant);
        return "new_Applicant";
    }
    
    @GetMapping("/acceptApp/{id}")
    public String acceptApp(Model model,@PathVariable(value = "id") final Long pid){

        Applicant applicant = applicantService.getApplicant(pid).get();
        applicant.setStatus("Accepted");
        model.addAttribute("applicant", applicant);
        Applicant applicant2 = applicantService.getApplicant(pid).get();
        ArrayList<Applicant> ll = new ArrayList<>() ;
        ll.add((applicantService.getApplicant(applicant.getId())).get());
        model.addAttribute("showapplicant", ll);
        applicantService.updateStatus(applicant2);
        return "selectDateofInt";
    }
    @PostMapping("/selectDOI/{id}")
    public String selectDOI(Model model,@PathVariable(value = "id") final Long pid){
        
        Applicant applicant = applicantService.getApplicant(pid).get();
        Date date=new Date();
        System.out.println(date);
        String[] dt = date.toString().split(" ");
        applicant.setDobInt(""+dt[2]+"-"+dt[1]+"-"+dt[5]);
        model.addAttribute("applicant", applicant);
        Applicant applicant2 = applicantService.getApplicant(pid).get();
        ArrayList<Applicant> ll = new ArrayList<>() ;
        ll.add((applicantService.getApplicant(applicant.getId())).get());
        model.addAttribute("showapplicant", ll);
        applicantService.updateStatus(applicant2);
        
        return "Admin";
    }
    @GetMapping("/rejectApp/{id}")
    public String rejectApp(Model model,@PathVariable(value = "id") final Long pid){
        
        Applicant applicant = applicantService.getApplicant(pid).get();
        applicant.setId(pid);
        applicant.setStatus("Rejected");
        Applicant applicant2 = applicantService.getApplicant(pid).get();
        ArrayList<Applicant> ll = new ArrayList<>() ;
        ll.add((applicantService.getApplicant(applicant.getId())).get());
        model.addAttribute("showapplicant", ll);
        applicantService.updateStatus(applicant2);
        return "show_applicantStatus";
    }

    @GetMapping("/viewStatus")
    public String viewAppPage(Model model){
        Applicant applicant = new Applicant();
        model.addAttribute("statusapplicant", applicant);
        return "status";
    }
    @PostMapping("/getApplicant")
    public String viewApplicantStatus(Model model,@ModelAttribute ("Applicant") Applicant applicant){

        ArrayList<Applicant> ll = new ArrayList<>() ;
        ll.add((applicantService.getApplicant(applicant.getId())).get());
        model.addAttribute("showapplicant", ll);
        return "show_applicantStatus";
    }
    
    
    @PostMapping("/saveApplicant")
    public String saveApplicant(@ModelAttribute ("Applicant") Applicant applicant) {
       applicantService.saveApplicant(applicant);
        return "redirect:/";
    }

}
