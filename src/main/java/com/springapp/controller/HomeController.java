package com.springapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping
    public String displayHelloWorld()
    {
        return "index";
    }

    @RequestMapping("/student-form")
    public String displayForm(){
        return "form";
    }

    @RequestMapping("/student")
    public String displayStudent(){
        return "student";
    }
}
