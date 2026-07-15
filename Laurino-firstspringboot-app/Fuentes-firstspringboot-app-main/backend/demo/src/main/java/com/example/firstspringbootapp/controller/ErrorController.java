package com.example.firstspringbootapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {
    
    @GetMapping("/error")
    public String handleError() {
        return "This is an error.";
    }

}
