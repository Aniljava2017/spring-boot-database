package com.example.springbootdatabase.service;

import com.example.springbootdatabase.model.Employee;
import com.example.springbootdatabase.repository.EmployeeJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceEmployee {
    @Autowired
    EmployeeJpaRepository employeeJpaRepository;
    public List<Employee> getEmployeeList(){
        return employeeJpaRepository.findAll();
    }
    public String add_employee(Employee employee){
        String msg="";
        if (employee.getDep().equals("CS")){
            employeeJpaRepository.save(employee);
            msg="Successfully added to Database";
        }
        else {
            msg="Employee does not belong to CS Dept";
        }
        return msg;
    }
    public void delete_employee(Long id){
        employeeJpaRepository.deleteById(id);
    }
}
