package com.example.backend_sfm.course;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseRestApi {

    @PostMapping("/")
    public void addCourse(){

    }

    @GetMapping("/")
    public List<Course> getCourses(){

        return null;
    }

}
