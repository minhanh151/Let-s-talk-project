package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Role;
import com.springboot.repository.RoleDAO;

@Service
public class RoleService {
	
	@Autowired
	RoleDAO roleDAO;
		
	public long count() {
		return roleDAO.count();
	}

	public void save(Role role) {
		roleDAO.save(role);
	}
	
	public Role getByName(String name) {
		return roleDAO.findByRoleName(name);
	}
	
}
