package com.huseyinozkan.demo.rest;

import com.huseyinozkan.demo.dao.EmployeeDAO;
import com.huseyinozkan.demo.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeDAO employeeDAO;

    public EmployeeRestController(EmployeeDAO theEmployeeDAO) {
        this.employeeDAO = theEmployeeDAO;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeDAO.findAll();
    }
}
