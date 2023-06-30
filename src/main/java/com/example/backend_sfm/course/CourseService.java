package com.example.backend_sfm.course;

import com.example.backend_sfm.user.User;

import java.util.List;

public interface CourseService {

    Course addCourse(Course course);

    void deleteCourse(long id);

    List<Course> getAllCourses();

    Course getCourse(long id);

    void addCourseTeacher(User teacher, long id);

    void addCourseStudent(User Student, long id);

    List<User> getUsers(long id);
}
