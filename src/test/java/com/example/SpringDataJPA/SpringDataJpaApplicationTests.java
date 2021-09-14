package com.example.SpringDataJPA;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.SpringDataJPA.entity.Student;
import com.example.SpringDataJPA.repo.StudentRepository;

@SpringBootTest
class SpringDataJpaApplicationTests {
	@Autowired
	 private StudentRepository repository;
	//test repo branch
	@Test
	public void testSaveStudentRepo() {
		Student student = new Student("doan van vinh", 20);
		repository.save(student);
	}
	
	@Test
	public void testReadStudentRepo() {
		System.out.println(repository.findAll().toString());
	}
	@Test
	public void testUpdateStudentRepo() {
		Student student = repository.findAll().get(0);
		student.setName("van vinh");
		repository.save(student);
	}
	@Test
	public void testDeleteStudentRepo() {
		repository.deleteById(repository.findAll().get(0).getId());
	}

}
