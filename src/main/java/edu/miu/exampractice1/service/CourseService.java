package edu.miu.exampractice1.service;

import edu.miu.exampractice1.entity.Course;
import edu.miu.exampractice1.entity.Student;

import java.util.List;

public interface CourseService {


    public void save(Course course);
    public List<Course> findAll();
    public Course findAllById(String  id);
    public void deleteById(String id);
}
