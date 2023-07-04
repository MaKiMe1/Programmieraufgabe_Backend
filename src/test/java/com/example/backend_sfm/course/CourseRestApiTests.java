package com.example.backend_sfm.course;

import com.example.backend_sfm.user.Person;
import com.example.backend_sfm.user.UserRepository;
import com.example.backend_sfm.user.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.sql.Time;
import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = CourseRestApi.class)
public class CourseRestApiTests {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @MockBean
    CourseRepository courseRepository;

    @MockBean
    CourseService courseService;

    @MockBean
    UserRepository userRepository;

    @MockBean
    UserService userService;

    @Test
    public void testAddCourse() throws Exception{
        Course testCourse = new Course();

        mockMvc.perform(post("/course")
                .contentType("application/json").content(objectMapper.writeValueAsString(testCourse)))
                .andExpect(status().isOk());

    }

}
