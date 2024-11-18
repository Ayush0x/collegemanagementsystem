package com.example.university.rest.api.universitydata.services;

import com.example.university.rest.api.universitydata.dto.Studentdto;
import com.example.university.rest.api.universitydata.entities.Student_Entity;
import com.example.university.rest.api.universitydata.exceptions.ResourceNotFoundException;
import com.example.university.rest.api.universitydata.repositories.Student_Repository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class Student_Service_Implementation implements Student_Service{

    private final Student_Repository studentRepository;
    private final ModelMapper modelMapper;

    @Override
    public Studentdto getStudentById(Long id) {
        log.info("Fetching student by id: {}",id);
        Student_Entity student=studentRepository.findById(id)
                .orElseThrow(()->{
                log.error("Student not found with id: "+id);
                return new ResourceNotFoundException("Student not found with id:"+id);
                });
            log.info("Student fetched with id: "+id);
        return modelMapper.map(student, Studentdto.class);
    }
}
