package edu.miu.exampractice1.controller;

import edu.miu.exampractice1.entity.Subject;
import edu.miu.exampractice1.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/subjects")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;


    @PostMapping
    public void save(@RequestBody Subject subject){
        subjectService.save(subject);
    }
}
