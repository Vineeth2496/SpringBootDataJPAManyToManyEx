package com.SpringBootJDataJPA.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootJDataJPA.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
