package com.example.easyloan.management.welcomeController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {

   @RequestMapping("/welcome")
   public String welcome(){
       return "Welcome to Loan Management System";
    }
}
