package com.example.schoolmanagement1.controller;

import com.example.schoolmanagement1.model.Student;
import com.example.schoolmanagement1.service.StudentJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
class StudentController{
    @Autowired
    public StudentJpaService studentService;

    @GetMapping("/students")
    public ArrayList<Student> getStudents(){
        return studentService.getStudents();
    }
    @GetMapping("/students/class/{classId}")
    public ArrayList<Student> getStudentsByClass(@PathVariable("classId") int classId) {
        return studentService.getStudentsByClass(classId);
    }
}