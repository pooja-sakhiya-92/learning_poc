package com.ga.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ga.learning.service.LearningService;

//@SpringBootApplication
public class LearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningApplication.class, args);

		// AOP

		ApplicationContext context = new ClassPathXmlApplicationContext("learning.xml");
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext) context;

		LearningService ls = (LearningService) cxt.getBean("learningServiceProxy");
		ls.setName("TEST");
		ls.helloLearner();

		System.out.println("***************");
		try {
			ls.invalidArgument();

		} catch (Exception e) {
		}

	}

}
