package com.example.backend_sfm.course;

import com.example.backend_sfm.user.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CourseServiceImpl implements CourseService{

    @Autowired
    CourseRepository courseRepo;

    public Course addCourse(Course course) {
        return null;
    }

    public void deleteCourse(long id) {

    }

    public List<Course> getAllCourses() {
        return null;
    }

    public Course getCourse(long id) {
        return null;
    }

    public void addCourseTeacher(User teacher, long id) {

    }

    public void addCourseStudent(User Student, long id) {

    }

    public List<User> getUsers(long id) {
        return null;
    }
}
