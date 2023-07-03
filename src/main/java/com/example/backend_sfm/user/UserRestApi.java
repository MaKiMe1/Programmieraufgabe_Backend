package com.example.backend_sfm.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserRestApi {

    @Autowired
    UserService userService;

    @PostMapping("/")
    public void addUser(@RequestBody Person person){
        userService.addUser(person);
    }
}
