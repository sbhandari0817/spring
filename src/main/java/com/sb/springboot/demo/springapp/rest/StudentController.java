package com.sb.springboot.demo.springapp.rest;

import com.sb.springboot.demo.springapp.dao.StudentDAO;
import com.sb.springboot.demo.springapp.entity.Student;
import com.sb.springboot.demo.springapp.entityclass.StudentE;
import com.sb.springboot.demo.springapp.error.StudentErrorResponse;
import com.sb.springboot.demo.springapp.error.StudentNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @GetMapping("/student/{studentId}")
    public StudentE getStudentWithId(@PathVariable int studentId) {
        List<StudentE> list = new ArrayList<>();
        list.add(new StudentE("Ram", "Khadka"));
        list.add(new StudentE("Hari", "Sharma"));

        //Check the studentID against list size
        if (studentId >= list.size() || studentId < 0) {
            throw new StudentNotFoundException("Student id not found : " + studentId );
        }

        return list.get(studentId);
    }
}
