package com.isut.springboot1.dao;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "STUDENT")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "studentSequence")
    @SequenceGenerator(name="studentSequence", sequenceName = "student_sequence")
    @Column(name="ID")
    private Long id;
    @Column(name="fname")
    private String firstName;
    @Column(name="lname")
    private String lastName;

    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "addresses", joinColumns = @JoinColumn(name="student_id"))
    private Set<Address> address = new HashSet<>();

    protected Student() { }

    public Student(StudentDto studentDto){
        id=studentDto.getId();
        firstName=studentDto.getFirstName();
        lastName=studentDto.getLastName();
        for (AddressDto addressDto:studentDto.getAddresses()) {
            address.add(new Address(addressDto));
        }
        address.add(new Address());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Set<Address> getAddress() {
        return address;
    }

    public void setAddress(Set<Address> address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getId().equals(student.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}