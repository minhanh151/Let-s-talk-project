package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Hashtag;
import com.springboot.repository.HashtagDAO;

@Service
public class HashtagService {
	
	@Autowired
	HashtagDAO hashtagDAO;
		
	public long count() {
		return hashtagDAO.count();
	}

	public void save(Hashtag level) {
		hashtagDAO.save(level);
	}
	
}