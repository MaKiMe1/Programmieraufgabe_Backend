package com.example.backend_sfm.user.student;

import com.example.backend_sfm.course.Course;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.text.DateFormat;
import java.util.List;


public class Student {

    @Id
    @GeneratedValue
    protected long id;

    protected String name;
    protected String surname;
    protected DateFormat birthDate;

//    @ManyToMany
//    protected List<Course> courses;
    private int grade;

}
