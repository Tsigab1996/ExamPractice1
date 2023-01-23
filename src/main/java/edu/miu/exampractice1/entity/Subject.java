package edu.miu.exampractice1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Subject {
    @Id
    private int subject_id;
    private String topic;

    @ManyToOne
    private Course course;
}
