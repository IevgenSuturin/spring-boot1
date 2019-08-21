package com.isut.springboot1.dao;

public class StudentDto {
    protected StudentDto(){}

    public StudentDto(Student student){
        Id=student.getId();
        firstName=student.getFirstName();
        lastName=student.getLastName();
    }
    private long Id;
    private String firstName;
    private String lastName;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
