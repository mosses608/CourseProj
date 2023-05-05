package com.SpringBoot.MyString.repository;

import com.SpringBoot.MyString.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
