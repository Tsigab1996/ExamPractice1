package edu.miu.exampractice1.service;

import edu.miu.exampractice1.entity.Course;
import edu.miu.exampractice1.entity.Student;

import java.util.List;

public interface StudentService {

    public List<Course> getAllBystudent(Integer id);
    public List<Student> getStudentByGpaGreaterThanEqual(double gpa);

    public void save(Student student);
    public List<Student> findAllBy();
    public Student findAllById(Integer id);
    public void deleteById(Integer id);

}
