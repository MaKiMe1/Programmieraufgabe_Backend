package com.example.backend_sfm.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepo;

    public Person addUser(Person person) {
        return userRepo.save(person);
    }
}
