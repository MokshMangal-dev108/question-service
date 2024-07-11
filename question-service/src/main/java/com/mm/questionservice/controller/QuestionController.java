package com.mm.questionservice.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mm.questionservice.Repository.QuestionRepository;
import com.mm.questionservice.entity.Question;
import com.mm.questionservice.service.QuestionService;


@RestController
@RequestMapping("/question")
public class QuestionController {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private QuestionService questionService;

	@GetMapping
	public ResponseEntity<List<Question>> getAllQuestion() {
		List<Question> question = questionRepository.findAll();
		return new ResponseEntity<List<Question>>(question,HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Question> addQuestion(@RequestBody Question question) {
		Question q = questionService.addThisQuestion(question);
		return new ResponseEntity<Question>(q,HttpStatus.OK);
	}
	
	@GetMapping("/category")
	public ResponseEntity<List<Question>> getQuestionFromFilter(@RequestParam String category){
		List<Question> question = questionRepository.findQuestionByCategory(category);
		return new ResponseEntity<List<Question>>(question,HttpStatus.OK);
	}
}
