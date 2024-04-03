package com.example.schoolmanagement1.model;
import com.example.schoolmanagement1.model.Student;
import jakarta.persistence.*;
import java.util.List;
@Entity
public class ClassDetails {
    @Id
    @Column(name="class_id")
    private int classId;
    @Column(name="class_strength")
    private int classStrength;

    @OneToMany
    @JoinColumn(name = "student_id") // Mapping student_id as the foreign key
    private List<Student> students;


    public void setStudent(List<Student> students) {
        this.students = students;
    }
    public List<Student> getStudent() {
        return students;
    }
    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassStrength(int classStrength) {
        this.classStrength = classStrength;
    }

    public int getClassStrength() {
        return classStrength;
    }
    public ClassDetails(){
    }
    private ClassDetails(int classId, int classStrength, List<Student> students){
        this.classId=classId;
        this.classStrength=classStrength;
        this.students=students;
    }
}
