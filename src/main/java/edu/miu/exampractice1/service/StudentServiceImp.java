package edu.miu.exampractice1.service;

import edu.miu.exampractice1.entity.Course;
import edu.miu.exampractice1.entity.Student;
import edu.miu.exampractice1.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentRepo studentRepo;
    @Override
    public List<Course> getAllBystudent(Integer id) {
        return studentRepo.getAllBystudent(id);
    }

    @Override
    public List<Student> getStudentByGpaGreaterThanEqual(double gpa) {
        return studentRepo.getStudentByGpaGreaterThanEqual(gpa);
    }

    @Override
    public void save(Student student) {
        studentRepo.save(student);
    }

    @Override
    public List<Student> findAllBy() {
        return studentRepo.findAll();
    }

    @Override
    public Student findAllById(Integer id) {
       return studentRepo.findById(id).get();
    }

    @Override
    public void deleteById(Integer id) {
        studentRepo.deleteById(id);
    }


}
