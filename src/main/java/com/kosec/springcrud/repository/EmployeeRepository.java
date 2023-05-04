package com.kosec.springcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kosec.springcrud.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    
}
