package com.mm.questionservice.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	private String title;
	
	private String option1;
	
	private String option2;
	
	private String option3;
	
	private String option4;
	
	private String option5;
	
	private String rightAnswer;
	
	private String difficultyLevel;
	
	private String category;
	
}
