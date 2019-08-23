package com.isut.springboot1.services;

import com.isut.springboot1.dao.IStudentRepository;
import com.isut.springboot1.dao.Student;
import com.isut.springboot1.dao.StudentDto;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class DataSetvice implements IDataService{
    private final IStudentRepository studentRepository;

    public DataSetvice(IStudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    @Transactional
    public Optional<Long> addStudent(StudentDto studentDto) {
        return studentRepository.addStudent(new Student(studentDto));
    }
}
