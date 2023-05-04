package com.kosec.springcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.kosec.springcrud.model.Program_Scheduled;
import com.kosec.springcrud.service.Program_ScheduledService;

@Controller
public class Program_ScheduledController {
    
    @Autowired
    private Program_ScheduledService program_ScheduledService;
    
    @GetMapping("/new_ps")
    public String viewNewPage(Model model){
        model.addAttribute("listProgram_Scheduleds", program_ScheduledService.getAllProgram_Scheduleds());
        return "view_Program_Scheduled";
    }

    @GetMapping("/appPs")
    public String viewPage(Model model){
        return "Admin";
    }

    @GetMapping("/Login")
    public String viewloginPage(Model model){
        return "new_user";
    }

    @GetMapping("/ps")
    public String viewHomePage(Model model){
        model.addAttribute("listProgram_Scheduleds", program_ScheduledService.getAllProgram_Scheduleds());
        return "new_Program_Scheduled";
    }

    @GetMapping("/showNewProgram_ScheduledForm")
    public String showNewprogram_ScheduledForm(Model model) {
        Program_Scheduled program_Scheduled = new Program_Scheduled();
        model.addAttribute("program_Scheduled", program_Scheduled);
        return "progScheduled";
    }

    @GetMapping("/deleteProgram/{id}")
	public String deleteProgramById(Model model,@PathVariable (value = "id") Long id) {
		this.program_ScheduledService.deleteProgramById(id);
		return  "redirect:/ps";
	}

    @PostMapping("/saveProgram_Scheduled")
    public String saveprogram_Scheduled(@ModelAttribute ("program_Scheduled") Program_Scheduled program_Scheduled) {
        program_ScheduledService.saveProgram_Scheduled(program_Scheduled);
        return "redirect:/ps";
    }

}
