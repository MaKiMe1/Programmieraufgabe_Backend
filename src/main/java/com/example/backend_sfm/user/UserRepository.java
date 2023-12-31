package com.example.backend_sfm.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Person, Long> {

    Person findById(long id);
}
