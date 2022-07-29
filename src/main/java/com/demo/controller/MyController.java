package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.PersonService;

@RestController
public class MyController {
	@Autowired
	private PersonService personService;
	
	@GetMapping("/person")
	public ResponseEntity<?> getAllPerson(){
		return ResponseEntity.ok(this.personService.getAllPerson());
	}
}
