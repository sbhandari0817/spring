package com.sb.springboot.demo.springapp.dao;

import com.sb.springboot.demo.springapp.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findById(int Id);

    Employee save(Employee employee);

    void deleteById(int Id);
}
