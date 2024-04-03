package com.example.schoolmanagement1.repository;
import com.example.schoolmanagement1.model.ClassDetails;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClassDetailsRepository {

    List<ClassDetails> getStudentsByClass(int classId);
}
