package com.sb.springboot.demo.springapp.rest;

import com.sb.springboot.demo.springapp.entity.Employee;
import com.sb.springboot.demo.springapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
   private final EmployeeService employeeService;

   @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee findById(@PathVariable int employeeId) {
       Employee employee = employeeService.findByID(employeeId);
       if (employee == null) {
           throw new RuntimeException("Employee id not found- "+ employeeId);
       }
       return employee;
    }

    //add mapping for post/employees - add new employees
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        // also just in case they pass an id in JSON .... set id to 0
        // thi is to force a save of new item... instead of update
       employee.setId(0);
       Employee newEmployee = employeeService.save(employee);
       return newEmployee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
       Employee newEmployee = employeeService.save(employee);
       return newEmployee;
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId) {
        Employee employee = employeeService.findByID(employeeId);

        //Throw null exception
        if (employee == null) {
            throw new RuntimeException("Employee id not found -" + employeeId);
        }
        employeeService.deleteById(employeeId);
        return "Deleted employee of id: " + employeeId;
    }
}
