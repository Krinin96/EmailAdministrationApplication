package com.main.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.employee.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {

}
