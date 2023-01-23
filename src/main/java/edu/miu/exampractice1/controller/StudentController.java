package edu.miu.exampractice1.controller;

import edu.miu.exampractice1.SpringAOP.Alert;
import edu.miu.exampractice1.entity.Course;
import edu.miu.exampractice1.entity.Student;
import edu.miu.exampractice1.entity.Subject;
import edu.miu.exampractice1.repo.SubjectSearchDAO;
import edu.miu.exampractice1.service.StudentService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudent(){
        return studentService.findAllBy();
    }

    @GetMapping("/course/{id}")
    public List<Course> getAllCourse(@PathVariable Integer id){
        return studentService.getAllBystudent(id);
    }

    @GetMapping("/filter/{id}")
    public List<Student> getAllStudent(@RequestParam(value = "gpa", required = false) Double gpa){
        return studentService.getStudentByGpaGreaterThanEqual(gpa);
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Integer id){
        return studentService.findAllById(id);
    }
    @Transactional
    @Modifying
    @Alert
    @PostMapping
    public void save(@RequestBody Student student){
        studentService.save(student);
    }
    @Alert
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        studentService.deleteById(id);
    }

    //This is for the Subject Search  DAO

    @Autowired
    private SubjectSearchDAO subjectSearchDAO;

    @GetMapping("/subject/filter")
    public List<Subject> getAllSubjects(@RequestParam(value = "topic", required = false) String topic){
        return subjectSearchDAO.getAllSubjects(topic);
    }


}
