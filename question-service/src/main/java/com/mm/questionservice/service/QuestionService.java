package com.mm.questionservice.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.mm.questionservice.Repository.QuestionRepository;
import com.mm.questionservice.entity.Question;


@Service
public class QuestionService {

	@Autowired
	private QuestionRepository questionRepository;
	
	public Question addThisQuestion(Question question) {
		return questionRepository.save(question);
	}
	
}
