package com.isut.springboot1.controllers;

import com.isut.springboot1.dao.StudentDto;
import com.isut.springboot1.services.IDataService;
import com.isut.springboot1.services.IInformationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("students")
public class StudentController {
    private final IInformationService informationService;
    private final IDataService dataService;

    public StudentController(IInformationService informationService, IDataService dataService) {
        this.informationService = informationService;
        this.dataService = dataService;
    }

    @GetMapping(produces = {"application/json"})
    public Iterable<StudentDto>getAllStudents(){
        return informationService.getAllStudents();
    }

    @PostMapping(consumes = {"application/json"})
    public ResponseEntity<String> addStudent(@RequestBody StudentDto studentDto)
    {
        Optional<Long> res = dataService.addStudent(studentDto);
        String response = res.isPresent()?"Student Id:"+res.get().toString() : "Student with this Id has been entered before!";
        return new ResponseEntity<String>(response, HttpStatus.MULTI_STATUS);
    }
}
