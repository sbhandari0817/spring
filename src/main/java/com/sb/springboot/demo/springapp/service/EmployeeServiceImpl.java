package com.sb.springboot.demo.springapp.service;

import com.sb.springboot.demo.springapp.dao.EmployeeDAO;
import com.sb.springboot.demo.springapp.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    // Define field for entity manager
    private EmployeeDAO employeeDAO;

    // Set up constructor
    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findByID(int Id) {
        return employeeDAO.findByID(Id);
    }

    @Override
    @Transactional
    public Employee save(Employee employee) {
        return employeeDAO.save(employee);
    }

    @Override
    @Transactional
    public void deleteById(int Id) {
        employeeDAO.deleteById(Id);
    }
}
