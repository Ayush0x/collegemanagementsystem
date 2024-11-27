package com.example.university.rest.api.universitydata.services;

import com.example.university.rest.api.universitydata.dto.Studentdto;
import org.springframework.stereotype.Service;

@Service
public interface Student_Service {
    Studentdto getStudentById(Long id);

    Studentdto createNewStudent(Studentdto studentdto);
}
