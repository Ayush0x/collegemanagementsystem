package com.example.university.rest.api.universitydata.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Professor Table")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProfessorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long professorId;

    private String professorName;
}
