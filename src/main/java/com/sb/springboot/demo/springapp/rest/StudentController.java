package com.sb.springboot.demo.springapp.rest;

import com.sb.springboot.demo.springapp.entityclass.StudentE;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    //define end point for /stduent
    @GetMapping("/student")
    public List<StudentE> getStudent() {
        List<StudentE> list = new ArrayList<>();
        list.add(new StudentE("Ram", "Giri"));
        list.add(new StudentE("Hari", "Guithe"));
        list.add(new StudentE("Shyam", "Kunwar"));
        return list;
    }
}
