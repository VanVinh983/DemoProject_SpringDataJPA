package com.example.SpringDataJPA;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.SpringDataJPA.repo.StudentRepository;

@SpringBootTest
class SpringDataJpaApplicationTests {
	@Autowired
	StudentRepository repository;
	@Test
	void ReadStudentById() {
		Long id = repository.findAll().get(0).getId();
		System.out.println(repository.getStudentById(id).toString());
	}

}
