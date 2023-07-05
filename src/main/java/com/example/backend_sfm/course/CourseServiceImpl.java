package com.example.backend_sfm.course;

import com.example.backend_sfm.user.Person;
import com.example.backend_sfm.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    CourseRepository courseRepo;

    @Autowired
    UserService userService;

    public void addCourse(Course course) {
        courseRepo.save(course);
        if (course.getTeacher() == null) { return; }
        userService.getUser(course.getTeacher().getId()).getCourses().add(course);
        for (Person student : course.getStudents()) {
            userService.getUser(student.getId()).getCourses().add(course);
        }
    }

    public void deleteCourse(long id) {
        courseRepo.deleteById(id);
    }

    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    public Course getCourse(long id) {
        return courseRepo.findById(id);
    }

    public void addCourseTeacher(Person teacher, long id) {
        getCourse(id).setTeacher(teacher);
        userService.getUser(teacher.getId()).getCourses().add(getCourse(id));
    }

    public void addCourseStudent(Person student, long id) {
        getCourse(id).getStudents().add(student);
        userService.getUser(student.getId()).getCourses().add(getCourse(id));
    }

    public List<Person> getUsers(long id) {
        return getCourse(id).getStudents();
    }

    public CourseServiceImpl(CourseRepository courseRepo, UserService userService) {
        this.courseRepo = courseRepo;
        this.userService = userService;
    }
}
