package com.example.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * This class(CalculatorController) is recognized as a controller and is responsible for request processing.
 */
@Controller
public class CalculatorController{

    /**
    * GET request to the root (“/”) displays the input form.
    */
    @GetMapping("/")
    public String showForm(){
        // src/main/resources/templates/index.html
        // this file structure is template of Spring Boot
        return "index";
    }

    /**
    * Define POST endpoint "/calculate" for handling form submissions
    */
    @PostMapping("/calculate")
    public String calculate(
        // Receive form data (num1, num2, operator) as method arguments
        @RequestParam double num1,
        @RequestParam double num2,
        @RequestParam String operator,
        // Objects that pass data to the view
        Model model
    ){
        double result = 0;
        switch(operator){
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            // Divide only if num2 is non-zero, otherwise return 0
            case "/" -> result = (num2 != 0) ? num1 / num2 : 0;
            default -> result = 0;
        }
        
        // Register results to Model and return views
        model.addAttribute("result",result);
        return "result";
    }
}