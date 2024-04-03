package com.example.schoolmanagement1.controller;

import com.example.schoolmanagement1.model.Attendance;
import com.example.schoolmanagement1.service.AttendanceJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AttendanceController {
    @Autowired
    private AttendanceJpaService attendanceJpaService;

    @GetMapping("/attendance")
    public List<Attendance> getAttendance(){
        return attendanceJpaService.getAttendance();
    }
    @GetMapping("/attendance/class/{classId}")
    public List<Attendance> getAttendanceByClass(@PathVariable("classId") int classId){
        return attendanceJpaService.getAttendanceByClass(classId);
    }
    @PostMapping("/teacher/markAttendance")
    public Attendance addAttendance(@RequestBody Attendance attendance) {
        return attendanceJpaService.addAttendance(attendance);
    }
}
