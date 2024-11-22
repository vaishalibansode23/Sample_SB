package com.tak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Operations {
	
	@GetMapping("/insertNumber")
	public int doOperation()
	{
		return 10+10;
	}
	@GetMapping("/hello")
	public String hello()
	{
		return "hello";
	}

}
