package com.example.university.rest.api.universitydata.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Student Table")
@Getter
@Setter

public class Student_Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    @Column(nullable = false)
    private String studentName;

    private 
}
