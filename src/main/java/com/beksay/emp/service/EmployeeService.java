package com.beksay.emp.service;

import com.beksay.emp.dto.APIResponseDto;
import com.beksay.emp.dto.EmployeeDto;

public interface EmployeeService {

    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);

}
