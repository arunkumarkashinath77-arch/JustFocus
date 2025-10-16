package com.employeemanagementservice.service;


import com.employeemanagementservice.model.Employee;
import com.employeemanagementservice.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee save(Employee e) {
        return employeeRepository.save(e);
    }

    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }
}
