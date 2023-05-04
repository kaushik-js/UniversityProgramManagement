package com.kosec.springcrud.controller;

import com.kosec.springcrud.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.kosec.springcrud.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/userhome")
    public String viewHomePage(Model model){
        model.addAttribute("listUsers", userService.getAllUser());
        return "user_index";
    }
    
    @GetMapping("/showNewUserForm")
    public String showNewUserForm(Model model) {
        Users user = new Users();
        model.addAttribute("user", user);
        return "new_user";
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute ("user") Users user) {

        userService.saveUser(user);
        return "redirect:/userhome";
    }
}
