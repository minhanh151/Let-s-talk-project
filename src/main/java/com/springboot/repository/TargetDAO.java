package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Target;

@Repository
public interface TargetDAO extends JpaRepository<Target, Long> {
	Target findByTargetName(String name);
}
