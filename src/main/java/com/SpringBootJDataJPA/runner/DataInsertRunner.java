package com.SpringBootJDataJPA.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.SpringBootJDataJPA.model.Course;
import com.SpringBootJDataJPA.model.Student;
import com.SpringBootJDataJPA.repo.CourseRepository;
import com.SpringBootJDataJPA.repo.StudentrRepository;
@Component
public class DataInsertRunner implements CommandLineRunner {
	@Autowired
	private StudentrRepository srepo;
	@Autowired
	private CourseRepository crepo;
	@Override
	public void run(String... args) throws Exception {
		Course c1=new Course(50, "Core Java", 500.00);
		Course c2=new Course(51, "Spring Boot", 600.00);
		Course c3=new Course(52, "Micro Services", 800.00);
		
		crepo.save(c1);
		crepo.save(c2);
		crepo.save(c3);
		
		Student s1=new Student(5, "AJAY", "ajay@gmail.com", Set.of(c1, c2));
		Student s2=new Student(6, "SYED", "syed@gmail.com", Set.of(c2, c3));
		
		srepo.save(s1);
		srepo.save(s2);
	}

}
