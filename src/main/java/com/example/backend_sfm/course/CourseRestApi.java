package com.example.backend_sfm.course;

import com.example.backend_sfm.user.User;
import com.example.backend_sfm.user.student.Student;
import com.example.backend_sfm.user.teacher.Teacher;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseRestApi {

    @PostMapping("/")
    public void addCourse(@RequestBody Course course){

    }

    @GetMapping("/")
    public List<Course> getCourses(){

        return null;
    }

    @GetMapping("/{courseid}")
    public Course getCourse(@PathParam("courseid") long id){

        return null;
    }

    @DeleteMapping("/{courseid}")
    public void deleteCourse(@PathParam("courseid") long id){

    }

    @PostMapping("/{courseid}/teacher")
    public void addTeacher(@PathParam("courseid") long id, @RequestBody Teacher teacher){

    }

    @PostMapping("/{courseid}/student")
    public void addStudent(@PathParam("courseid") long id, @RequestBody Student student){

    }

    @GetMapping("/{courseid}/users")
    public List<User> getCourseUsers(@PathParam("courseid") long id){

        return null;
    }
}
