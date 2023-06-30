package com.example.backend_sfm.user;

import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepo;

    public User addUser(User user) {
        return userRepo.save(user);
    }
}
