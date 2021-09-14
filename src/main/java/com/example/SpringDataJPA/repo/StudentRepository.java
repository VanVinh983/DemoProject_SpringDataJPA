package com.example.SpringDataJPA.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.SpringDataJPA.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
	@Query(value = "select s from student s where s.id = :id", nativeQuery = true)
	Student getStudentById(@Param("id") Long id);
}
