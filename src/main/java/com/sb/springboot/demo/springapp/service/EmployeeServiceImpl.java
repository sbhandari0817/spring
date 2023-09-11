package com.sb.springboot.demo.springapp.service;

import com.sb.springboot.demo.springapp.entity.Employee;
import com.sb.springboot.demo.springapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    // Define field for entity manager
    private final EmployeeRepository employeeRepository;

    // Set up constructor
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findByID(int Id) {
        Optional<Employee> result = employeeRepository.findById(Id);
        Employee theEmployee = null;
        if (result.isPresent()) { theEmployee = result.get(); }
        return theEmployee;
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteById(int Id) {
        employeeRepository.deleteById(Id);
    }
}
