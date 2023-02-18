package com.project.studentmanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.studentmanagementsystem.entity.Student;
import com.project.studentmanagementsystem.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student("Aman" , "Bhala" , "amanbhala813@gmail.com");
		studentRepository.save(student1);

		Student student2 = new Student("Neha" , "Bhala" , "nehabhala813@gmail.com");
		studentRepository.save(student2);

		Student student3 = new Student("Usha" , "Bhala" , "ushabhala813@gmail.com");
		studentRepository.save(student3);

		Student student4 = new Student("Vishnu" , "Bhala" , "vishnubhala813@gmail.com");
		studentRepository.save(student4);
	}
}
