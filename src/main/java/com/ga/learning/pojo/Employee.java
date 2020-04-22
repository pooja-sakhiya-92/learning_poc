package com.ga.learning.pojo;

import org.springframework.stereotype.Component;

@Component
public class Employee implements Learner {

	private String employeeId;
	public String name;
	
	public String getStudentId() {
		return employeeId;
	}
	public void setStudentId(String studentId) {
		this.employeeId = studentId;
	}
	public String getName() {
		return name;
	}
	
	//@Autowired
	public void setName(String name) {
		this.name = name;
	}
	
	
}
