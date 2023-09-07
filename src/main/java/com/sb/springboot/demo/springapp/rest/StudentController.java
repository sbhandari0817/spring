package com.sb.springboot.demo.springapp.rest;

import com.sb.springboot.demo.springapp.dao.StudentDAO;
import com.sb.springboot.demo.springapp.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    private StudentDAO studentDAO;

    @Autowired
    public StudentController(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }
    //define end point for /stduent
    @GetMapping("/student")
    public List<Student> getStudent() {
        return studentDAO.findAll();
    }

    @GetMapping("/student/{studentId}")
    public Student getStudentWithId(@PathVariable int studentId) {
        return studentDAO.findById(studentId);
    }
}
