package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Person;
import com.demo.repo.Personrepo;

@Service
public class PersonService {

	@Autowired
	private Personrepo repo;
	
	public List<Person> getAllPerson(){
		return this.repo.findAll();
	}

//create constructor for service testing
	public PersonService(Personrepo repo) {
		super();
		this.repo = repo;
	}
	
	
}
