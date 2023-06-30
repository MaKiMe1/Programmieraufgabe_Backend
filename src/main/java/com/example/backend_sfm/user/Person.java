package com.example.backend_sfm.user;

import com.example.backend_sfm.course.Course;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.text.DateFormat;
import java.util.List;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String surname;
    private DateFormat birthDate;

    @ManyToMany
    private List<Course> courses;

    private boolean isTeacher;
    private int grade;
    private List<String> subjects;
}
