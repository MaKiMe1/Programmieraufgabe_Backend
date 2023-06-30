package com.example.backend_sfm.user.teacher;

import com.example.backend_sfm.course.Course;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.text.DateFormat;
import java.util.List;


public class Teacher  {

    @Id
    @GeneratedValue
    protected long id;

    protected String name;
    protected String surname;
    protected DateFormat birthDate;

    @ManyToMany
    protected List<Course> courses;
    private List<String> subjects;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public DateFormat getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(DateFormat birthDate) {
        this.birthDate = birthDate;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
}
