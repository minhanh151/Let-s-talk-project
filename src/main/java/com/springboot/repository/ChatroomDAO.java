package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Chatroom;


@Repository
public interface ChatroomDAO extends JpaRepository<Chatroom, Long> {
}
