package com.isut.springboot1.services;

import com.isut.springboot1.dao.IStudentRepository;
import com.isut.springboot1.dao.Student;
import com.isut.springboot1.dao.StudentDto;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class InformationService implements IInformationService {
    private final IStudentRepository studentRepository;

    public InformationService(IStudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }

    @Override
    @Transactional
    public Iterable<StudentDto> getAllStudents() {
        List<StudentDto> result = new ArrayList<>();
        for (Student student:studentRepository.getAllStudents()) {
            result.add(new StudentDto(student));
        }
        return result;
    }
}
