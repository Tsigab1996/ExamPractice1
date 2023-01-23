package edu.miu.exampractice1.controller;

import edu.miu.exampractice1.entity.Course;
import edu.miu.exampractice1.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping
    public void save(@RequestBody Course course){
        courseService.save(course);
    }
}
