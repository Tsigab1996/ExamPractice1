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
public class Course {
    @Id
    private String course_id;
    private String name;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;

    @OneToMany(mappedBy = "course", cascade = CascadeType.REMOVE)
    private List<Subject> subjects;
}
