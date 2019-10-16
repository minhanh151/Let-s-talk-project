package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Target;
import com.springboot.repository.TargetDAO;

@Service
public class TargetService {
	
	@Autowired
	TargetDAO targetDAO;
		
	public long count() {
		return targetDAO.count();
	}

	public void save(Target target) {
		targetDAO.save(target);
	}
	
	public Target getByName(String name) {
		return targetDAO.findByTargetName(name);
	}
	
}
