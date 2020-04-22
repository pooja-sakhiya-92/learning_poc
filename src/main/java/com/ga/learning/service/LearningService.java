package com.ga.learning.service;

//@Component
public class LearningService {

	/*
	 * @Autowired
	 * 
	 * @Qualifier("student") Learner learner;
	 */

	String name;
	String role;

	/*
	 * public Learner getLearner() { return learner; }
	 * 
	 * public void setLearner(Learner learner) { this.learner = learner; }
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String helloLearner() {
		return "Hello learner!";
	}

	public void invalidArgument() {
		throw new IllegalArgumentException();
	}
}
