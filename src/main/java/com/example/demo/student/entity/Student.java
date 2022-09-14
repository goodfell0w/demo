package com.example.demo.student.entity;

import lombok.*;

import java.time.LocalDate;

@Data
@ToString
@Getter
@Setter
@EqualsAndHashCode
public class Student {
    private Long id;
    private String name;
    private String email;
    private Integer age;
    private LocalDate dateOfBirth;

    private Student(String name,
                   String email,
                   LocalDate dateOfBirth) {
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public Student buildStudent(String name, String email, LocalDate dob){
        return new Student(name, email, dob);
    }


}

