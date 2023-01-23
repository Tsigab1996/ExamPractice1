package edu.miu.exampractice1.service;

import edu.miu.exampractice1.entity.Student;
import edu.miu.exampractice1.entity.Subject;

import java.util.List;

public interface SubjectService {


    public void save(Subject subject);
    public List<Subject> findAllBy();
    public Subject findAllById(Integer id);
    public void deleteById(Integer id);
}
