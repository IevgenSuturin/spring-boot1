package com.isut.springboot1.dao;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.Optional;

@Repository
public class StudentRepository implements IStudentRepository {
    private final EntityManager entityManager;

    public StudentRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Iterable<Student> getAllStudents() {
        return entityManager.createQuery( "from Student", Student.class).getResultList();
    }

    @Override
    public Optional<Long> addStudent(Student student) {
        if(student.getId()==null)
        {
            entityManager.persist(student);
        }
        return Optional.of(student.getId());
    }
}
