package com.telefonica.helloworld.springboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/api")
@CrossOrigin(origins = "*")
public class HelloWorld {
	
	
	@GetMapping(value = "/hello")
	public ResponseEntity<?> getTickets() {
		return ResponseEntity.ok().body("Hello world");
	}

}
