package com.example.crudRepo.controller;

import com.example.crudRepo.dto.Employee;
import com.example.crudRepo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    private EmployeeService employeeService;
     @Autowired
    public TestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    List<Employee> getEmployee(){
        return employeeService.getAllEmps();
    }

}
