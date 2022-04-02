package com.youtube.springboot.repository;

import com.youtube.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
