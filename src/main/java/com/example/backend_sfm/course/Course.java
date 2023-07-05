package com.example.backend_sfm.course;

import com.example.backend_sfm.user.Person;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue
    @Column(name = "course_id")
    private long id;

    private String title;
    private String description;
    private Timestamp startTime;
    private Timestamp endTime;
    private String category;

    @ManyToOne
    private Person teacher;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "course_people",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "person_id")
    )
    private List<Person> people = new ArrayList<Person>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Person getTeacher() {
        return teacher;
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    public List<Person> getStudents() {
        return people;
    }

    public void setStudents(List<Person> people) {
        this.people = people;
    }
}
