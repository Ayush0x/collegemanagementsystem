package com.example.university.rest.api.universitydata.repositories;

import com.example.university.rest.api.universitydata.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Student_Repository extends JpaRepository<StudentEntity,Long> {

}
