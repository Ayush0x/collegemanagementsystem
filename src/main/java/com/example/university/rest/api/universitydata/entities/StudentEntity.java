package com.example.university.rest.api.universitydata.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Student Table")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    @Column(nullable = false)
    private String studentName;


}
