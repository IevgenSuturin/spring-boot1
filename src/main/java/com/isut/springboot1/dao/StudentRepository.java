package com.isut.springboot1.dao;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

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
}
