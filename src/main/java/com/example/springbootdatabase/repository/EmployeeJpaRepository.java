package com.example.springbootdatabase.repository;

import com.example.springbootdatabase.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeJpaRepository extends JpaRepository<Employee, Long> {
    public Employee findByName(String name);

}
