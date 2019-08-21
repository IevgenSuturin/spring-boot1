package com.isut.springboot1.controllers;

import com.isut.springboot1.dao.StudentDto;
import com.isut.springboot1.services.IInformationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("students")
public class StudentController {
    private final IInformationService informationService;

    public StudentController(IInformationService informationService) {
        this.informationService = informationService;
    }

    @GetMapping(produces = {"application/json"})
    public Iterable<StudentDto>getAllStudents(){
        return informationService.getAllStudents();
    }
}
