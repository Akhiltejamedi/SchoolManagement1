package com.example.schoolmanagement1.model;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private int studentId;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "student_class")
    private int studentClass;
    @Column(name="parent_email")
    private String parentEmail;
   /* @OneToOne
    private Attendance attendance;
    @ManyToOne
   // @JoinColumn(name = "principal_id")
    private Principal principal;*/

    public Student() {

    }

    public String getParentEmail() {
        return parentEmail;
    }

    public void setParentEmail(String parentEmail) {
        this.parentEmail = parentEmail;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /*  public void setAttendance(Attendance attendance) {
        this.attendance = attendance;
    }
    public Attendance getAttendance(){
        return attendance;
    }*/

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(int studentClass) {
        this.studentClass=studentClass;
    }

   /* public void setPrincipal(Principal principal){
        this.principal=principal;
    }
    public Principal getPrincipal(){
        return principal;
    }*/
    public Student(int studentId,String studentName,int studentClass,String parentEmail){
        this.studentId=studentId;
        this.studentName=studentName;
        this.studentClass=studentClass;
        this.parentEmail=parentEmail;
    }

}
