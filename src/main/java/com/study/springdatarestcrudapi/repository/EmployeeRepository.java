package com.study.springdatarestcrudapi.repository;

import com.study.springdatarestcrudapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
