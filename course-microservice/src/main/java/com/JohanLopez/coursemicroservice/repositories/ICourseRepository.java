package com.JohanLopez.coursemicroservice.repositories;

import com.JohanLopez.coursemicroservice.entities.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepository extends CrudRepository<Course, Long> {
}