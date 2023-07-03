package com.example.backend_sfm.user;

import com.example.backend_sfm.course.Course;
import jakarta.persistence.*;

import java.text.DateFormat;
import java.util.List;

@Entity
public class Person {

    @Id
    @GeneratedValue
    @Column(name = "people_id")
    private long id;

    private String name;
    private String surname;
    private DateFormat birthDate;

    @ManyToMany(mappedBy = "people")
    private List<Course> courses;

    private boolean isTeacher;
    private int grade;
    private List<String> subjects;
}
