package com.scluzzy.springbootrestapidemo.dao;

import com.scluzzy.springbootrestapidemo.entitiy.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}
