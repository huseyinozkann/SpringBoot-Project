package com.huseyinozkan.demo.rest;

import com.huseyinozkan.demo.dao.EmployeeDAO;
import com.huseyinozkan.demo.entity.Employee;
import com.huseyinozkan.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

   private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    public Employee getEmployee(@PathVariable int employeeId){

       Employee theEmployee = employeeService.findById(employeeId);

       if (theEmployee == null){
           throw new RuntimeException("Employee id not found - " + employeeId);
       }
       return theEmployee;
    }
}
