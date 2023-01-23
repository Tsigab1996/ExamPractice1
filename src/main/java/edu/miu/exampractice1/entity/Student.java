package edu.miu.exampractice1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Student {
    @Id
    private int student_id;
    private String name;
    private double gpa;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private Address address;

    @ManyToMany
    private List<Course> courses;
}


