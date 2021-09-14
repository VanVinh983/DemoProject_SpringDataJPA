package com.example.SpringDataJPA.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringDataJPA.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
}
