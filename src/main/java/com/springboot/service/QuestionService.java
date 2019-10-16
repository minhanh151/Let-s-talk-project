package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Question;
import com.springboot.repository.QuestionDAO;


@Service
public class QuestionService {
	
	@Autowired
	QuestionDAO questionDAO;
		
	public long count() {
		return questionDAO.count();
	}

	public void save(Question question) {
		questionDAO.save(question);
	}
	
}
