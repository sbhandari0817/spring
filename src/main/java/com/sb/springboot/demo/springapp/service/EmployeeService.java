package com.sb.springboot.demo.springapp.service;

import com.sb.springboot.demo.springapp.entity.Employee;
import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findByID(int Id);

    Employee save(Employee employee);

    void deleteById(int Id);
}
