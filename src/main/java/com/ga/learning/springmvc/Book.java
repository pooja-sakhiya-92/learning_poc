/**
 * 
 */
package com.ga.learning.springmvc;

import org.springframework.stereotype.Component;

/**
 * @author Pooja Sakhiya
 *
 */
@Component
public class Book {

	private String bookId;
	String bookName;

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void init() {
		//System.out.println("Book bean initiated");
	}

	public void destroy() {
		//System.out.println("Book bean destroyed");
	}
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + "]";
	}

	public void display(String test) {
		System.out.println(test);
		
	}

}
