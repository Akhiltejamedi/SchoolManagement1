package com.example.schoolmanagement1.service;

import java.util.ArrayList;
import java.util.List;
import com.example.schoolmanagement1.repository.StudentJpaRepository;
import com.example.schoolmanagement1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.schoolmanagement1.model.Student;

@Service
public class StudentJpaService implements StudentRepository{
    @Autowired
    private StudentJpaRepository studentJpaRepository;

    @Override
    public ArrayList<Student> getStudents(){
        List<Student> studentList=studentJpaRepository.findAll();
        ArrayList<Student> students=new ArrayList<>(studentList);
        return students;
    }
    @Override
    public ArrayList<Student> getStudentsByClass(int classId){
        return studentJpaRepository.findByStudentClass(classId);
    }

}