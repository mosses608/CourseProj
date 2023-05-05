package com.SpringBoot.MyString.controller;

import com.SpringBoot.MyString.entity.Course;
import com.SpringBoot.MyString.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/course")
public class CourseController {
    private CourseService courseService;

    //build create Course rest api
    //http://localhost:8080/api/mycourse
    @PostMapping
    public ResponseEntity<Course> createCourse(@RequestBody Course course){
        Course mycourse1=courseService.createCourse(course);
        return new ResponseEntity<>(mycourse1, HttpStatus.CREATED);
    }
    //create get course by id rest api
    @GetMapping
    public ResponseEntity<Course> getCourseById(@PathVariable("id") Long courseId){
        Course mycourse2=courseService.getCourseById(courseId);
        return new ResponseEntity<>(mycourse2, HttpStatus.OK);
    }
    //create get all courses rest api
    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses(){
        List<Course> mycourse3=courseService.getAllCourses();
        return new ResponseEntity<>(mycourse3,HttpStatus.OK);
    }

    //create update course rest api
    @PutMapping
    public ResponseEntity<Course> updateCourse(@RequestBody Course course, @PathVariable("id") Long courseId){
        course.setId(courseId);
        Course mycourse4=courseService.updateCourse(course);
        return new ResponseEntity<>(mycourse4,HttpStatus.OK);
    }
    //create delete course rest api
    @DeleteMapping
    public ResponseEntity<String> deleteCourse(@PathVariable("id") Long courseId){
        courseService.deleteCourse(courseId);
        return new ResponseEntity<>("Course deleted successfully", HttpStatus.OK);
    }
}
