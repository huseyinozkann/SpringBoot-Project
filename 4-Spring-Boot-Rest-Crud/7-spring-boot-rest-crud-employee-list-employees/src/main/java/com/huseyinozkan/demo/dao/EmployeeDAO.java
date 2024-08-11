package com.huseyinozkan.demo.dao;

import com.huseyinozkan.demo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
