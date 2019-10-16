package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Question;


@Repository
public interface QuestionDAO extends JpaRepository<Question, Long> {

}