package edu.miu.exampractice1.service;

import edu.miu.exampractice1.entity.Course;
import edu.miu.exampractice1.entity.Student;
import edu.miu.exampractice1.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImp implements CourseService{

    @Autowired
    private CourseRepo courseRepo;

    @Override
    public void save(Course course) {
        courseRepo.save(course);
    }

    @Override
    public List<Course> findAll() {
        return courseRepo.findAll();
    }


    @Override
    public Course findAllById(String id) {
        return courseRepo.findById(id).get();
    }

    @Override
    public void deleteById(String id) {
        courseRepo.deleteById(id);
    }
}
