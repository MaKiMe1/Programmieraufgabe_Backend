package com.example.backend_sfm.course;

import com.example.backend_sfm.user.Person;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class CourseRestApi {

    @PostMapping("course")
    public void addCourse(@RequestBody Course course){

    }

    @GetMapping("course")
    public List<Course> getCourses(){

        return null;
    }

    @GetMapping("course/{courseid}")
    public Course getCourse(@PathParam("courseid") long id){

        return null;
    }

    @DeleteMapping("course/{courseid}")
    public void deleteCourse(@PathParam("courseid") long id){

    }

    @PostMapping("course/{courseid}/teacher")
    public void addTeacher(@PathParam("courseid") long id, @RequestBody Person teacher){

    }

    @PostMapping("course/{courseid}/student")
    public void addStudent(@PathParam("courseid") long id, @RequestBody Person student){

    }

    @GetMapping("course/{courseid}/users")
    public List<Person> getCourseUsers(@PathParam("courseid") long id){

        return null;
    }
}
