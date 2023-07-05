package com.example.backend_sfm.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserRestApi {

    @Autowired
    UserService userService;

    @PostMapping("user")
    public void addUser(@RequestBody Person person){
        userService.addUser(person);
    }

    @GetMapping("user/students")
    public List<Person> getAllStudents() {return userService.allStudents();}

    @GetMapping("user/teachers")
    public List<Person> getAllTeachers() {return userService.allTeachers();}
}
