package com.example.backend_sfm.user;

public interface UserService {

    Person addUser(Person person);

    Person getUser(long id);
}
