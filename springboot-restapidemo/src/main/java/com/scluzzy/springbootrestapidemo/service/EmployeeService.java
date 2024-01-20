package com.scluzzy.springbootrestapidemo.service;

import com.scluzzy.springbootrestapidemo.entitiy.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}
