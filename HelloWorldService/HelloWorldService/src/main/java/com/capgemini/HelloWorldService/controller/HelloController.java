package com.capgemini.HelloWorldService.controller;

import javax.annotation.Generated;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/helloWorlds")
public class HelloController {

	@GetMapping
	public String hello() {
		return "HELLO WORLD !!!!";
		
	}
}
