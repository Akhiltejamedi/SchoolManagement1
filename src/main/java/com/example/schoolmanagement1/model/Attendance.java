package com.example.schoolmanagement1.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Attendance {
    @Id
    @Column(name = "student_id")
    private int id;
    //@Column(name = "attendance_percentage")
    //private float percentage;
    @Column(name = "student_class")
    private int attendanceClass;
    @Column(name = "status")
    private String status;
    @Column(name="date")
    private LocalDate date;
    @OneToOne // Student and Attendance have a one-to-one relationship
    @JoinColumn(name = "student_id") // Mapping student_id as the foreign key
    private Student student;
    public Attendance(){}

    public void setAttendanceClass(int attendanceClass) {
        attendanceClass = attendanceClass;
    }

    public int getAttendanceClass() {
        return attendanceClass;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
  /*  public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }*/
    public Attendance(int id,String status,Student student){
        this.student=student;
        this.status=status;
        this.id=id;
    }
}

