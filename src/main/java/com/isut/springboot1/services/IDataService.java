package com.isut.springboot1.services;

import com.isut.springboot1.dao.StudentDto;

import java.util.Optional;

public interface IDataService {
    Optional<Long> addStudent(StudentDto studentDto);
}
