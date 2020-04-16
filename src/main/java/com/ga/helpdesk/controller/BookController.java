package com.ga.helpdesk.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/helpdesk")
public class BookController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String display(Locale locale, Model model) {

		System.out.println("Home page requested locale" + locale);

		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm").withLocale(locale);
		String date = LocalDateTime.now().format(ofPattern);

		model.addAttribute("serverTime", date);
		return "home";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String user(@Validated User user, Model model) {
		System.out.println("User page requested");
		model.addAttribute("userName", user.getUserName());
		return "user";

	}

	/*
	 * @RequestMapping(value = "/") public String display() {
	 * 
	 * System.out.println("Index page"); return "index"; }
	 */
}
