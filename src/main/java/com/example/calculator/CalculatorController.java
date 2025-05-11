package com.example.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController{

    @GetMapping("/")
    public String showForm(){
        return "index";
    }

    @PostMapping("/calculate")
    public String calculate(
        @RequestParam double num1,
        @RequestParam double num2,
        @RequestParam String operator,
        Model model
    ){
        double result = 0;

        switch(operator){
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> result = num1 / num2;
            default -> result = 0;
        }

        model.addAttribute("result",result);
        return "result";
    }
}