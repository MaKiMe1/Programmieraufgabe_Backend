package com.example.backend_sfm.course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CourseRepository extends JpaRepository<Course, Long> {

//    @Query(value = "SELECT * FROM course WHERE course_id == :id", nativeQuery = true)
    Course findById(long id);
}
