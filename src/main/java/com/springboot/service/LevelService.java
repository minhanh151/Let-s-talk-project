package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Level;
import com.springboot.repository.LevelDAO;

@Service
public class LevelService {
	
	@Autowired
	LevelDAO levelDAO;
		
	public long count() {
		return levelDAO.count();
	}

	public void save(Level level) {
		levelDAO.save(level);
	}
	
	public Level getByName(String name) {
		return levelDAO.findByLevelName(name);
	}
	
}
