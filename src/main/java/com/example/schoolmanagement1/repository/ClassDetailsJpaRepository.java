package com.example.schoolmanagement1.repository;

import com.example.schoolmanagement1.model.ClassDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassDetailsJpaRepository extends JpaRepository<ClassDetails,Integer> {
   // @Query("SELECT cd FROM ClassDetails cd JOIN FETCH cd.students WHERE cd.class_id = :classId")
      List<ClassDetails> findByClassId(int classId);
}
