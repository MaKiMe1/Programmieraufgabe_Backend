package com.example.backend_sfm.user.teacher;

import com.example.backend_sfm.user.User;

import java.util.List;

public class Teacher extends User {

    private List<String> subjects;

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
}
