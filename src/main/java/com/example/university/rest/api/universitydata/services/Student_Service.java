package com.example.university.rest.api.universitydata.services;

import com.example.university.rest.api.universitydata.dto.Studentdto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface Student_Service {
    ResponseEntity<Studentdto> getStudentById(Long id);

}
