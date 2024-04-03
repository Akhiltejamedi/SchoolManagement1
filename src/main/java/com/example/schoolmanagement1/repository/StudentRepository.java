package com.example.schoolmanagement1.repository;

import com.example.schoolmanagement1.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface StudentRepository {
    ArrayList<Student> getStudents();

    ArrayList<Student> getStudentsByClass(int classId);
}