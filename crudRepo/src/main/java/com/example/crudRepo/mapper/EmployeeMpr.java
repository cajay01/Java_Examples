package com.example.crudRepo.mapper;

import com.example.crudRepo.dto.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface EmployeeMpr {

    List<Employee> employeeToDto(List<com.example.crudRepo.entity.Employee> employee);
}
