package com.Task1.Controller;

import com.Task1.Entity.Student;
import com.Task1.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepository repo;

    // Get all the students
    // Endpoint: localhost:8081/students
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    //localhost:8081/students/1
    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id){
        Student student=repo.findById(id).get();
        return student;
    }

    @PostMapping("/student/add")
    @ResponseStatus(code= HttpStatus.CREATED)
    public void createStudent(@RequestBody Student student){
        repo.save(student);
    }

    @PutMapping("/student/update/{id}")
    public Student updateStudents(@PathVariable int id){
        Student student=repo.findById(id).get();
        student.setName("Mourya");
        student.setPercentage(92);
        repo.save(student);
        return student;
    }

    @DeleteMapping("/student/delete/{id}")
    public void removeStudent(@PathVariable int id){
        Student student=repo.findById(id).get();
        repo.delete(student);
    }
}
