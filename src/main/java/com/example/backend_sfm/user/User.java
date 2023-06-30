package com.example.backend_sfm.user;

import com.example.backend_sfm.course.Course;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String surname;
    private Date birtDate;

    private List<Course> courses;

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

    public Date getBirtDate() {
        return birtDate;
    }

    public void setBirtDate(Date birtDate) {
        this.birtDate = birtDate;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
