package com.example.thymeleaf.controller1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public String greet(Model model){
        model.addAttribute("message","HelloBroKaisiHo");
        return "hello";
    }
}
