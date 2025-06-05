package com.example.springboothtmlapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController { // Make sure class name matches filename
	
	@RequestMapping("/home")
	public String home() {
		return "home"; // Thymeleaf will look for home.html template
	}
}
