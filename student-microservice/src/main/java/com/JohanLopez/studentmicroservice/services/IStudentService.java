package com.JohanLopez.studentmicroservice.services;

import com.JohanLopez.studentmicroservice.entities.Student;

import java.util.List;

public interface IStudentService {

    List<Student> findAll();

    Student findById(Long id);

    void save(Student student);

    List<Student> findByIdCourse(Long idCourse);
}