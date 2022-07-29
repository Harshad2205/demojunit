package com.demo.repo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.entity.Person;

@SpringBootTest
public class PersonRepoTest {
	@Autowired
	private Personrepo pr;
	
	@Test
	void isPersonExistsById() {
		Person person = new Person(1,"Harshad");
		pr.save(person);
		Boolean acRes = pr.isPersonExistsById(1);
		assertThat(acRes).isTrue();
	}
	
	@BeforeEach
	void setUp() {
		System.out.println("Setup is started");
	}
	
	@AfterEach
	void tearDown() {
		System.out.println("Test Ended");
		pr.deleteAll();
	}
}
