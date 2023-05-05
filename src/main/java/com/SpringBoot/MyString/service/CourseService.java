package com.SpringBoot.MyString.service;

import com.SpringBoot.MyString.entity.Course;

import java.util.List;

public interface CourseService {
    Course createCourse(Course course);
    Course getCourseById(Long courseId);
    List<Course> getAllCourses();
    Course updateCourse(Course course);
    void deleteCourse(Long courseId);
}
