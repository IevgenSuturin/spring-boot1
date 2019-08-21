package com.isut.springboot1.services;

import com.isut.springboot1.dao.StudentDto;

public interface IInformationService {
    Iterable<StudentDto>getAllStudents();
}
