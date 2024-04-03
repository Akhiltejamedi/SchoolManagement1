package com.example.schoolmanagement1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.List;
import jakarta.persistence.OneToMany;
import com.example.schoolmanagement1.model.Student;
import jakarta.persistence.*;
@Entity
public class Principal {
    @Id
    @Column(name = "principal_name")
    private String name;
    @Column(name = "principal_age")
    private int age;
   /* @OneToMany(mappedBy = "principal")
    private List<Student> students;*/

    public Principal(int age,String name) {
        this.age=age;
        this.name = name;
    }

    public Principal() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    /*public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }*/

}
