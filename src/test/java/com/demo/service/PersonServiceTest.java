package com.demo.service;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.demo.repo.Personrepo;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {
	
	@Mock
	private Personrepo rp;
	
	private PersonService ps;
	
	@BeforeEach
	void setUp(){
		this.ps= new PersonService(this.rp);
		
	}
	
	@Test
	void getAllPerson() {
		ps.getAllPerson();
		verify(rp).findAll();
	}
}
