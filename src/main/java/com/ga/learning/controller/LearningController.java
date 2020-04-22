package com.ga.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ga.learning.service.LearningService;

@RestController
public class LearningController {
	
	@Autowired
	LearningService learningService;
	
	@RequestMapping("/hello")
	public String display() {
		return learningService.helloLearner();
	}

}
