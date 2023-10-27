package com.JohanLopez.coursemicroservice.services;

import com.JohanLopez.coursemicroservice.entities.Course;
import com.JohanLopez.coursemicroservice.http.response.StudentByCourseResponse;

import java.util.List;

public interface ICourseService {

    List<Course> findAll();

    Course findById(Long id);

    void save(Course course);

    StudentByCourseResponse findStudentsByIdCourse(Long idCourse);
}