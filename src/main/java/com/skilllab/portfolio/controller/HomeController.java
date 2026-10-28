package com.skilllab.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

   
    @GetMapping("/")
    public String home(Model model) {

        
        model.addAttribute("name", "Vishal Prajapati");
        model.addAttribute("title", "Java Backend Developer");
        model.addAttribute("tagline",
                "I build web applications with Java and Spring Boot - "
                + "and I'm looking for my first role as a backend developer.");

        return "index";
    }
}