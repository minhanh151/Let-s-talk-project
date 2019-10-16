package com.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.model.User;

@Controller
public class UserController {
	
	@Autowired
    private SessionRegistry sessionRegistry;
    
	
	@GetMapping("/users")
	public String getLoggedUsers(Model model) {
		
	    model.addAttribute("users", listLoggedInUsers());
	    
	    return "pages/users";
	}
	
    public List<User> listLoggedInUsers() {
    	
    	List<Object> allPrincipals = sessionRegistry.getAllPrincipals();
        
        List<User> usersNamesList = new ArrayList<User>();
        
        for (Object principal: allPrincipals) {
            if (principal instanceof User) {
                usersNamesList.add(((User) principal));
                System.out.println(((User) principal).getEmail());
            }
        }
        
        return usersNamesList;
    }
    
}
