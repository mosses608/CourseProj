package com.SpringBoot.MyString.serviceImpl;

import com.SpringBoot.MyString.entity.Course;
import com.SpringBoot.MyString.repository.CourseRepository;
import com.SpringBoot.MyString.service.CourseService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
@NoArgsConstructor
public class CourseServiceImpl implements CourseService {
    private CourseRepository courseRepository;
    @Override
    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course getCourseById(Long courseId) {
        Optional<Course> optionalCourse=courseRepository.findById(courseId);
        return optionalCourse.get();
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course updateCourse(Course course) {
        Course course1=courseRepository.findById(course.getId()).get();
        course1.setCourseName(course.getCourseName());
        course1.setCourseDepartment(course.getCourseDepartment());
        course1.setStudentNo(course.getStudentNo());
        Course updatedCourse=courseRepository.save(course);
        return updatedCourse;
    }

    @Override
    public void deleteCourse(Long courseId) {

    }
}
