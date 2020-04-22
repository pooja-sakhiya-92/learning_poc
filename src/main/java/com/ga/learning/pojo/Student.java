package com.ga.learning.pojo;

import org.springframework.stereotype.Component;

@Component("student")
public class Student implements Learner {

	private String studentId;
	public String name;
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	
	//@Autowired
	public void setName(String name) {
		this.name = name;
	}
	
	
}
