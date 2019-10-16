package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthController {
	
	@RequestMapping("/login")
	String login() {
		return "pages/login";
	}
	
	@RequestMapping("/register")
	String register() {
		return "pages/register";
	}

}
