package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Chatroom;
import com.springboot.repository.ChatroomDAO;

@Service
public class ChatroomService {
	
	@Autowired
	ChatroomDAO chatroomDAO;
		
	public long count() {
		return chatroomDAO.count();
	}

	public void save(Chatroom chatroom) {
		chatroomDAO.save(chatroom);
	}
	
}