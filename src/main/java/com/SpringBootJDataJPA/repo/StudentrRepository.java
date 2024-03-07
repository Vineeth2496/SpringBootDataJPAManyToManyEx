package com.SpringBootJDataJPA.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootJDataJPA.model.Student;

public interface StudentrRepository extends JpaRepository<Student, Integer> {

}
