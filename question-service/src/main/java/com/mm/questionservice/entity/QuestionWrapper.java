package com.mm.questionservice.entity;

import lombok.Data;

@Data
public class QuestionWrapper {


	private long id;
	
	private String title;
	
	private String option1;
	
	private String option2;
	
	private String option3;
	
	private String option4;
	
	private String option5;

	public QuestionWrapper(long id, String title, String option1, String option2, String option3, String option4,
			String option5) {
		super();
		this.id = id;
		this.title = title;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.option5 = option5;
	}
	
	
	
}
