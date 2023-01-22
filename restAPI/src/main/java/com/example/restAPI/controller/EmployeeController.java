package com.example.restAPI.controller;


import com.example.restAPI.model.User;
import com.example.restAPI.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("userForm", new User());
        return "index";
    }


    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user, Model model) {
        System.out.println(user.toString());
        model.addAttribute("userForm", new User());
        model.addAttribute("message", "you have registered successfully.");
        employeeRepository.save(user);
        return "index";

    }


}
