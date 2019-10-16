package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Level;

@Repository
public interface LevelDAO extends JpaRepository<Level, Long> {
	Level findByLevelName(String name);
}
