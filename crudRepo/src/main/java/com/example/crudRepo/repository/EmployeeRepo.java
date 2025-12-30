package com.example.crudRepo.repository;

import com.example.crudRepo.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {
}
