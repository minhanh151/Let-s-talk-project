package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Hashtag;

@Repository
public interface HashtagDAO extends JpaRepository<Hashtag, Long> {
}

