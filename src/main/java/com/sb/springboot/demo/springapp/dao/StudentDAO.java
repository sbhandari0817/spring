package com.sb.springboot.demo.springapp.dao;

import com.sb.springboot.demo.springapp.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student student);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String lastName);

    void update(Student student);

    void delete (Integer id);

    int deleteAll();
}
