package com.example.backend_sfm.course;

import com.example.backend_sfm.user.Person;

import java.util.List;

public interface CourseService {

    Course addCourse(Course course);

    void deleteCourse(long id);

    List<Course> getAllCourses();

    Course getCourse(long id);

    void addCourseTeacher(Person teacher, long id);

    void addCourseStudent(Person Student, long id);

    List<Person> getUsers(long id);
}
