package com.example.thymeleaf.controller2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VariableExpressionController {
    @GetMapping("/controller-2")//http://localhost:8080/controller-2
    public String m1(Model model){
        User user=new User("Anisha","Anisha@gmail.com","Admin");
        model.addAttribute("user",user);
        return "VariableExpression";
    }

}
