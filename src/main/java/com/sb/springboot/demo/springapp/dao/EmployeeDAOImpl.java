package com.sb.springboot.demo.springapp.dao;

import com.sb.springboot.demo.springapp.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    // Define field for entity manager
    private EntityManager entityManager;

    // Set up constructor
    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {

        //Define Query
        TypedQuery<Employee> typedQuery = entityManager.createQuery("FROM Employee", Employee.class);

        // Execute Query
        List<Employee> employeeList = typedQuery.getResultList();

        // Return the result
        return employeeList;
    }

    @Override
    public Employee findById(int Id) {
        Employee employee = entityManager.find(Employee.class, Id);
        return employee;
    }

    @Override
    public Employee save(Employee employee) {
        Employee updatedEmployee = entityManager.merge(employee);
        return updatedEmployee;
    }

    @Override
    public void deleteById(int Id) {
        Employee employee = entityManager.find(Employee.class, Id);
        entityManager.remove(employee);
    }
}
