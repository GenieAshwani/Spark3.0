package com.genie.JPADemo.controller;


import com.genie.JPADemo.entity.Employee;
import com.genie.JPADemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {


    @Autowired
    EmployeeService service;


    @GetMapping("/getAll")
    public List<Employee> getAllEmployee()
    {
        List<Employee> allEmp = service.getAllEmp();
        return allEmp;
    }

    @PostMapping("/save")
    public Employee createEmp(@RequestBody Employee employee)
    {
        Employee emp = service.createEmp(employee);
        return emp;
    }
}
