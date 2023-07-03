package com.example.backend_sfm.course;

import com.example.backend_sfm.user.Person;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class CourseRestApi {

    @Autowired
    CourseService courseService;

    @PostMapping("course")
    public void addCourse(@RequestBody Course course){
        courseService.addCourse(course);
    }

    @GetMapping("course")
    public List<Course> getCourses(){
        return courseService.getAllCourses();
    }

    @GetMapping("course/{courseid}")
    public Course getCourse(@PathParam("courseid") long id){
        return courseService.getCourse(id);
    }

    @DeleteMapping("course/{courseid}")
    public void deleteCourse(@PathParam("courseid") long id){
        courseService.deleteCourse(id);
    }

    @PostMapping("course/{courseid}/teacher")
    public void addTeacher(@PathParam("courseid") long id, @RequestBody Person teacher){
        courseService.getCourse(id).setTeacher(teacher);
    }

    @PostMapping("course/{courseid}/student")
    public void addStudent(@PathParam("courseid") long id, @RequestBody Person student){
        courseService.addCourseStudent(student, id);
    }

    @GetMapping("course/{courseid}/users")
    public List<Person> getCourseUsers(@PathParam("courseid") long id){
        return courseService.getUsers(id);
    }
}
