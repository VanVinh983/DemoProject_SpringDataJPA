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
	public void testReadStudentJPQL() {
		System.out.println(repository.selectStudent().toString());
	}

}
