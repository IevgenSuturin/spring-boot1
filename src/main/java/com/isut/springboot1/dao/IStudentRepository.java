package com.isut.springboot1.dao;

import java.util.Optional;

public interface IStudentRepository {
    Iterable<Student>getAllStudents();
    Optional<Long> addStudent(Student student);
}
