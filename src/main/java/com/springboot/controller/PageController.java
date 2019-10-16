package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	@GetMapping("/")
    public String test(Model model) {
        model.addAttribute("msg", "Hello World Spring");
        return "index";
    }
	
	@GetMapping("/about")
    public String about(Model model) {
        return "pages/about";
    }
}
