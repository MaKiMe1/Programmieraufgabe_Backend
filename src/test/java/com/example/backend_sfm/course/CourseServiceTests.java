package com.example.backend_sfm.course;

import com.example.backend_sfm.user.Person;
import com.example.backend_sfm.user.UserRepository;
import com.example.backend_sfm.user.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CourseServiceTests {

    @Mock
    CourseRepository courseRepository;

    @InjectMocks
    CourseServiceImpl courseService;

    @Mock
    UserRepository userRepository;

    @InjectMocks
    UserServiceImpl userService;

    @Test
    public void testCourseStudentTeacher(){
        courseService = new CourseServiceImpl(courseRepository, userService);

        Person teacher = new Person();
        teacher.setTeacher(true);
        teacher.setId(1);

        Person student = new Person();
        student.setTeacher(false);
        student.setId(2);

        Course testCourse = new Course();
        testCourse.setTeacher(teacher);
        testCourse.getStudents().add(student);

        when(userService.getUser(1)).thenReturn(teacher);
        when(userService.getUser(2)).thenReturn(student);

        courseService.addCourse(testCourse);

        assertThat(teacher.getCourses().contains(testCourse)).isTrue();
        assertThat(student.getCourses().contains(testCourse)).isTrue();
    }
}
