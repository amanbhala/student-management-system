package com.project.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.studentmanagementsystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
   
}
