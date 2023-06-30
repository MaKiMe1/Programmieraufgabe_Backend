package com.example.backend_sfm.course;

import com.example.backend_sfm.user.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    CourseRepository courseRepo;

    public Course addCourse(Course course) {
        return courseRepo.save(course);
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
        courseRepo.findById(id).setTeacher(teacher);
    }

    public void addCourseStudent(Person student, long id) {
        List<Person> students = courseRepo.findById(id).getStudents();
        students.add(student);
        courseRepo.findById(id).setStudents(students);
    }

    public List<Person> getUsers(long id) {
        return courseRepo.findById(id).getStudents();
    }
}
