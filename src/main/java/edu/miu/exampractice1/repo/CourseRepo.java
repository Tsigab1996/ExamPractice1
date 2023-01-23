package edu.miu.exampractice1.repo;

import edu.miu.exampractice1.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CourseRepo extends JpaRepository<Course, String> {

    //This is used when we needs to fetch data courses from the CourseRepo,
    // otherwise we can write it on the studentRepo as JPQL query.
    //public List<Course> findAllByStudents(Integer id);
}
