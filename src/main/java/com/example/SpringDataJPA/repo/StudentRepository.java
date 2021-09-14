package com.example.SpringDataJPA.repo;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.SpringDataJPA.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	@Query(value = "select s from student s")
	Collection<Student> selectStudent();
}
