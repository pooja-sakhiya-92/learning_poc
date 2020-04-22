package com.ga.learning.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Course {

	private String courseId;
	String courseName;
	String department;

	@Autowired
	Book book;

	public Course() {

		courseId = "Test course";
		courseName = "Test course name";
		department = "Test department";

		// High coupling , book object creation is dependent on course object cration
		//book = new Book();
		//System.out.println("Course object constructed");
	}

	// constrinctor based DI
	public Course(Book book) {
		this.book = book;
	}

	public Book getBook() {
		return book;
	}

	// Setter bassed DI -Loose coupling
	public void setBook(Book book) {
		this.book = book;

	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void init() {
		System.out.println("Course bean initiated");
	}

	public void destroy() {
		System.out.println("Course bean destroyed");
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", department=" + department + ", book="
				+ book + "]";
	}

	public void display() {
		book.display("Book displayed !!" + toString());
		
	}
}
