package com.scluzzy.springbootrestapidemo.service;

import com.scluzzy.springbootrestapidemo.dao.EmployeeDao;
import com.scluzzy.springbootrestapidemo.entitiy.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao EmployeeDao;

    @Autowired
    public EmployeeServiceImpl( EmployeeDao theEmployeeDao) {
        EmployeeDao = theEmployeeDao;
    }

    @Override
    public List<Employee> findAll() {
        return EmployeeDao.findAll();
    }

    @Override
    public Employee findById(int theId) {
        return EmployeeDao.findById(theId);
    }

    @Transactional
    @Override
    public Employee save(Employee theEmployee) {
        return EmployeeDao.save(theEmployee);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
        EmployeeDao.deleteById(theId);
    }
}
