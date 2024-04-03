package com.example.schoolmanagement1.controller;

import com.example.schoolmanagement1.model.ClassDetails;
import com.example.schoolmanagement1.service.ClassDetailsJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ClassDetailsController {
    @Autowired
    private ClassDetailsJpaService classDetailsJpaService;

    @GetMapping("/class/{classId}")
    public List<ClassDetails> getStudentsByClass(@PathVariable("classId") int classId) {
        List<ClassDetails> studentsByClass = classDetailsJpaService.getStudentsByClass(classId);
        return studentsByClass;
    }
}
