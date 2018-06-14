package com.practice.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
   @Value("${spring.profiles.active}")
   private String environment;
   
   @Value("${msg}")
   private String msg;
   
   @GetMapping("/")	
   public String home() {
	   return msg;
   }
}
