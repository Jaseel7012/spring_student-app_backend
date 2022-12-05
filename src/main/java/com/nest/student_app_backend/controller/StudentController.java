package com.nest.student_app_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/")
    public String Homepage(){
        return "welcome my homepage";
    }
    @GetMapping("/contact")
    public String ContactPage(){
        return "welcome my contact page";
    }

    @GetMapping("/gallery")

    public String Gallery(){
        return "welcome to gallery page";
    }

}
