package com.nandica.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nandica.demo.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
