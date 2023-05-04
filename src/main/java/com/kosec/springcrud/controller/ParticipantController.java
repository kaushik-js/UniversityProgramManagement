package com.kosec.springcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kosec.springcrud.model.Participant;
import com.kosec.springcrud.service.ParticipantService;

@Controller
public class ParticipantController {
    
    @Autowired
    private ParticipantService participantService;

    @GetMapping("/participanthome")
    public String viewHomePage(Model model){
        model.addAttribute("listParticipants", participantService.getAllParticipant());
        return "participant_index";
    }

    @GetMapping("/showNewParticipantForm")
    public String showNewApplicantForm(Model model) {
        Participant participant = new Participant();
        model.addAttribute("participant", participant);
        return "new_Participant";
    }


    @PostMapping("/saveParticipant")
    public String saveApplicant(@ModelAttribute ("participant") Participant participant) {
        participantService.addParticipant(participant);
        return "redirect:/participanthome";
    }
}
