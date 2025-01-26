package com.example.demo.EasySchoolApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	//@RequestMapping("/home")
	@RequestMapping(value = {"","/","/home"})
	public String displayHomePage() {
		return "home.html";
	}
	
}
