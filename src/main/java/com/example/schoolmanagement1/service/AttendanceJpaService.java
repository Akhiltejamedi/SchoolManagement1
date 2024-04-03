package com.example.schoolmanagement1.service;

import com.example.schoolmanagement1.repository.AttendanceJpaRepository;
import com.example.schoolmanagement1.model.Attendance;
import com.example.schoolmanagement1.repository.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AttendanceJpaService implements AttendanceRepository{
    @Autowired
    private AttendanceJpaRepository attendanceJpaRepository;
    
    @Override
    public List<Attendance> getAttendance(){
        List<Attendance> AttendanceList=attendanceJpaRepository.findAll();
//        ArrayList<Attendance> attendances = new ArrayList<>(AttendanceList);
        return AttendanceList;
    }
    @Override
    public List<Attendance> getAttendanceByClass(int classId){
        List<Attendance> AttendanceList=attendanceJpaRepository.findByAttendanceClass(classId);
        return AttendanceList;
    }
    public Attendance addAttendance(Attendance attendance){
        attendanceJpaRepository.save(attendance);
        return attendance;
    }
}
