package edu.miu.exampractice1.service;

import edu.miu.exampractice1.entity.Student;
import edu.miu.exampractice1.entity.Subject;
import edu.miu.exampractice1.repo.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SubjectServiceImp implements SubjectService{

    @Autowired
    private SubjectRepo subjectRepo;

    @Override
    public void save(Subject subject) {
        subjectRepo.save(subject);
    }

    @Override
    public List<Subject> findAllBy() {
        return subjectRepo.findAll();
    }

    @Override
    public Subject findAllById(Integer id) {
        return subjectRepo.findById(id).get();
    }

    @Override
    public void deleteById(Integer id) {
        subjectRepo.deleteById(id);
    }
}
