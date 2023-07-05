package com.example.backend_sfm.course;

import com.example.backend_sfm.user.Person;
import com.example.backend_sfm.user.UserRepository;
import com.example.backend_sfm.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    CourseRepository courseRepo;

    @Autowired
    UserRepository userRepo;

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
        Course course = getCourse(id);
        Person t = userService.getUser(teacher.getId());
        course.setTeacher(t);
        courseRepo.save(course);
        t.getCourses().add(course);
        userRepo.save(t);
    }

    public void addCourseStudent(Person student, long id) {
        Course course = getCourse(id);
        Person s = userService.getUser(student.getId());
        course.getStudents().add(student);
        courseRepo.save(course);
        s.getCourses().add(course);
        userRepo.save(s);
    }

    public List<Person> getUsers(long id) {
        return getCourse(id).getStudents();
    }

    public CourseServiceImpl(CourseRepository courseRepo, UserService userService) {
        this.courseRepo = courseRepo;
        this.userService = userService;
    }
}
