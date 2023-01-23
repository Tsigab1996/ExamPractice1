package edu.miu.exampractice1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Address {
    @Id
    private int address_id;
    private String city;
    private String state;
    private String zipcode;

    @OneToOne
    private Student student;
}
