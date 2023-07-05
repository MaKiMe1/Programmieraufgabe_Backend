package com.example.backend_sfm.user;

import java.util.List;

public interface UserService {

    Person addUser(Person person);

    Person getUser(long id);

    List<Person> allStudents();

    List<Person> allTeachers();
}
