package com.youtube.springboot.service;

import com.youtube.springboot.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployeeList();

    Employee getEmployeeById(long id);

    Employee updateEmployee(Employee employee, long id);

    void deleteEmployee(long id);


}
