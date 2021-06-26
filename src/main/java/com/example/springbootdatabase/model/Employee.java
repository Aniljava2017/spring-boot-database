package com.example.springbootdatabase.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "EMPLOYEE_TABLE")

public class Employee {
    public Employee (){
    }
    @Id
    @GeneratedValue
    //@Column(name = "EMP_ID")
    Long id;
    @Column(name = "EMP_NAME")
    String name;
    int emp_id;
    @Column(name = "EMP_AGE")
    int age;
    @Column(name = "EMP_DEP")
    String dep;
    // use consutructor

    public Employee(String name, Long id, int age, String dep) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.dep = dep;
    }

    // getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) { this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }
}
