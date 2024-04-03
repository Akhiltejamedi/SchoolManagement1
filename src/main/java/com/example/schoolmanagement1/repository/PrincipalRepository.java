package com.example.schoolmanagement1.repository;

import com.example.schoolmanagement1.model.Principal;
import com.example.schoolmanagement1.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public interface PrincipalRepository {
    ArrayList<Principal> getPrincipal();

    Student addStudent(Student student);
    void removeStudentById(int studentId);
}
