package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.model.Role;

@Repository
public interface RoleDAO extends JpaRepository<Role, Long> {
	Role findByRoleName(String name);
}