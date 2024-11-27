package com.example.university.rest.api.universitydata.services.service_implementation;

import com.example.university.rest.api.universitydata.dto.Studentdto;
import com.example.university.rest.api.universitydata.entities.Student_Entity;
import com.example.university.rest.api.universitydata.exceptions.ResourceNotFoundException;
import com.example.university.rest.api.universitydata.repositories.Student_Repository;
import com.example.university.rest.api.universitydata.services.Student_Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class Student_Service_Implementation implements Student_Service {

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

    @Override
    public Studentdto createNewStudent(Studentdto studentdto) {
        Optional<Student_Entity> existingStudent=studentRepository.findById(studentdto.getStudentId());
        if(!existingStudent.isEmpty())
        {
            log.error("Student already exists");
            throw new RuntimeException("Student already exists");
        }
        Student_Entity newStudent=modelMapper.map(studentdto, Student_Entity.class);
        Student_Entity savedStudent=studentRepository.save(newStudent);
        return modelMapper.map(savedStudent, Studentdto.class);
    }
}
