package com.example.schoolmanagement1.service;

import com.example.schoolmanagement1.model.ClassDetails;
import com.example.schoolmanagement1.model.Student;
import com.example.schoolmanagement1.repository.ClassDetailsJpaRepository;
import com.example.schoolmanagement1.repository.ClassDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ClassDetailsJpaService implements ClassDetailsRepository {
    @Autowired
    private ClassDetailsJpaRepository classDetailsJpaRepository;
    @Override
    public List<ClassDetails> getStudentsByClass(int classId){
        return classDetailsJpaRepository.findByClassId(classId);
    }
}
