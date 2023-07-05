package com.example.backend_sfm.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepo;

    public Person addUser(Person person) {
        return userRepo.save(person);
    }

    public Person getUser(long id) { return userRepo.findById(id);}

    public List<Person> allStudents() {
        List<Person> result = new ArrayList<Person>();
        for (Person p: userRepo.findAll()) {
            if (!p.isTeacher()) {
                result.add(p);
            }
        }
        return result;
    }

    public List<Person> allTeachers() {
        List<Person> result = new ArrayList<Person>();
        for (Person p: userRepo.findAll()) {
            if (p.isTeacher()) {
                result.add(p);
            }
        }
        return result;
    }
}
