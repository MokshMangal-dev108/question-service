package com.mm.questionservice.Repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mm.questionservice.entity.Question;


public interface QuestionRepository extends JpaRepository<Question, Long>{

	@Query("select q from Question q where q.category=:category")
	public List<Question> findQuestionByCategory(@Param("category") String category);

	@Query("select q from Question q where q.category=:category order by random() limit :numQ")
	public List<Question> findRandomQuestionByCategory(@Param("numQ")int numQ,@Param("category") String category);
	
	
}
