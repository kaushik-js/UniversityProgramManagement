package com.kosec.springcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kosec.springcrud.model.Program_Offered;
import com.kosec.springcrud.service.Program_OfferedService;

@Controller
public class Program_OfferedController {
    
    @Autowired
    private Program_OfferedService program_OfferedService;
    
    @GetMapping("/programoffered")
    public String viewHomePage(Model model){
        model.addAttribute("listProgram_Offered", program_OfferedService.getAllProgram_Offered());
        return "programOffered_index";
    }

    @GetMapping("/showNewProgram_OfferedForm")
    public String showNewprogram_OfferedForm(Model model) {
        Program_Offered program_Offered = new Program_Offered();
        model.addAttribute("program_Offered", program_Offered);
        return "new_Program_Offered";
    }


    @PostMapping("/saveProgram_Offered")
    public String saveprogram_Offered(@ModelAttribute ("program_Offered") Program_Offered program_Offered) {
        program_OfferedService.saveProgram_Offered(program_Offered);
        return "redirect:/programoffered";
    }
}
