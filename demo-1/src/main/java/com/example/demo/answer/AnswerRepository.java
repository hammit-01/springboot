package com.example.demo.answer;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.question.Question;
public interface AnswerRepository extends JpaRepository<Question, Integer> {

}
