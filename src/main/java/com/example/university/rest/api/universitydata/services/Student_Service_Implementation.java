package com.example.university.rest.api.universitydata.services;

import com.example.university.rest.api.universitydata.dto.Studentdto;
import com.example.university.rest.api.universitydata.repositories.Student_Repository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class Student_Service_Implementation implements Student_Service{

    private final Student_Repository studentRepository;
    private final ModelMapper modelMapper;

    @Override
    public ResponseEntity<Studentdto> getStudentById(Long id) {
        log.info("Fetching student by id: {}",id);

    }
}
