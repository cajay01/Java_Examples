package com.example.crudRepo.service;

import com.example.crudRepo.dto.Employee;
import com.example.crudRepo.mapper.EmployeeMpr;
import com.example.crudRepo.repository.EmployeeRepo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class EmployeeService {

    private EmployeeRepo employeeRepo;
    private EmployeeMpr employeeMpr;
    @Autowired
    EmployeeService(EmployeeRepo employeeRepo,EmployeeMpr employeeMpr){
        this.employeeRepo = employeeRepo;
        this.employeeMpr=employeeMpr;
    }

   public List<Employee> getAllEmps(){
        return employeeMpr.employeeToDto((List<com.example.crudRepo.entity.Employee>) employeeRepo.findAll());
    }
}
