package edu.miu.exampractice1.repo;

import edu.miu.exampractice1.entity.Course;
import edu.miu.exampractice1.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

    @Query("select c from Course  c join c.students s where s.student_id=:id")
    public List<Course> getAllBystudent(Integer id);

    @Query("select s from Student s where s.gpa>=:gpa")
    public List<Student> getStudentByGpaGreaterThanEqual(double gpa);
}
