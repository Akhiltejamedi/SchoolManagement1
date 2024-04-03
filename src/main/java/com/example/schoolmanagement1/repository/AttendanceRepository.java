package com.example.schoolmanagement1.repository;

import com.example.schoolmanagement1.model.Attendance;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttendanceRepository {
    List<Attendance> getAttendance();

    List<Attendance> getAttendanceByClass(int classid);
    Attendance  addAttendance(Attendance attendance);
}
