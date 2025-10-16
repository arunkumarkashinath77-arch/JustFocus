package com.employeemanagementservice.repository;

import com.employeemanagementservice.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    

    @Query(
            value = "UPDATE employees SET name = :name, email = :email, department = :department WHERE id = :id",
            nativeQuery = true
    )
    @Modifying
    @Transactional
    void updateEmployee(
            @Param("id") Long id,
            @Param("name") String name,
            @Param("email") String email,
            @Param("department") String department
    );
}
