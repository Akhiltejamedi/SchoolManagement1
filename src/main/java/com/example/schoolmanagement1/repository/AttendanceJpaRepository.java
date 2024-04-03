package com.example.schoolmanagement1.repository;

import com.example.schoolmanagement1.model.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttendanceJpaRepository extends JpaRepository<Attendance,Integer> {
    List<Attendance> findByAttendanceClass(int classId);

}
