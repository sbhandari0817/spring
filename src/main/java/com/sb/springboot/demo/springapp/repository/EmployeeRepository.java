package com.sb.springboot.demo.springapp.repository;

import com.sb.springboot.demo.springapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // That's it ...... no need to write any code. ...
    // Except customization.
}
