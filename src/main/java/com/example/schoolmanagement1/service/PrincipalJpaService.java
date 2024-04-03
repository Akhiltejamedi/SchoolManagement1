package com.example.schoolmanagement1.service;

import com.example.schoolmanagement1.repository.PrincipalJpaRepository;
import com.example.schoolmanagement1.repository.PrincipalRepository;
import com.example.schoolmanagement1.model.Student;
import com.example.schoolmanagement1.model.Principal;
import com.example.schoolmanagement1.repository.StudentJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.List;

@Service
public class PrincipalJpaService implements PrincipalRepository {
    @Autowired
    private PrincipalJpaRepository principalJpaRepository;
    @Autowired
    private StudentJpaRepository studentJpaRepository;

    @Override
    public ArrayList<Principal> getPrincipal(){
        List<Principal> principalList=principalJpaRepository.findAll();
        return new ArrayList<>(principalList);
    }
    @Override
    public Student addStudent(Student student){
        studentJpaRepository.save(student);
        return student;
    }
    @Override
    public void removeStudentById(int studentId){
        studentJpaRepository.deleteById(studentId);
    }

}
