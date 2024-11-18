package com.example.university.rest.api.universitydata.repositories;

import com.example.university.rest.api.universitydata.entities.Student_Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Student_Repository extends JpaRepository<Student_Entity,Long> {

}
