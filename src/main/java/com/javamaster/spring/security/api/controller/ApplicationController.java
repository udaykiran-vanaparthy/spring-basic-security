package com.javamaster.spring.security.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author thatsuday
 * Generates the application Controller
 *
 */
@RestController
@RequestMapping("/rest/auth")
public class ApplicationController {

	@GetMapping("/getMsg")
	public String greeting() {
		return "spring security example";
	}

}
