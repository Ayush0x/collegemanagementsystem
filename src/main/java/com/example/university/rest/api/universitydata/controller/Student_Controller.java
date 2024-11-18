package com.example.university.rest.api.universitydata.controller;

import com.example.university.rest.api.universitydata.dto.Studentdto;
import com.example.university.rest.api.universitydata.services.Student_Service;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequiredArgsConstructor
@RequestMapping("/students")
public class Student_Controller {
    private final Student_Service studentService;

    @GetMapping("/{id}")
    public ResponseEntity<Studentdto> getStudentById(@PathVariable Long id)
    {
        Studentdto studentdto=studentService.getStudentById(id);
        return ResponseEntity.ok(studentdto);
    }
}
