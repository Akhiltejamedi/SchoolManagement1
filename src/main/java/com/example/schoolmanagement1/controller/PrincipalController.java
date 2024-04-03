package com.example.schoolmanagement1.controller;

import com.example.schoolmanagement1.model.Principal;
import com.example.schoolmanagement1.model.Student;
import com.example.schoolmanagement1.service.PrincipalJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PrincipalController {
    @Autowired
    private PrincipalJpaService principalJpaService;

    @GetMapping("/principal")
    public ArrayList<Principal> getPrincipal(){
        return principalJpaService.getPrincipal();
    }

    @PostMapping("/principal/addstudent")
    public Student addStudent(@RequestBody Student student) {
        return principalJpaService.addStudent(student);
    }
    @DeleteMapping("principal/removestudent/{studentId}")
    public void removeStudentById(@PathVariable("studentId") int studentId) {
        principalJpaService.removeStudentById(studentId);
    }

}
