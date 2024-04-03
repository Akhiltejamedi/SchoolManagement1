package com.example.schoolmanagement1.repository;

import com.example.schoolmanagement1.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository

public interface StudentJpaRepository extends JpaRepository<Student,Integer> {
    ArrayList<Student> findByStudentClass(int classId);
}
