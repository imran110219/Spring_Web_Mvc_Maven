package com.sadman.springmvc.dao;

import java.util.List;

import com.sadman.springmvc.model.Employee;
import org.springframework.stereotype.Component;

public interface EmployeeDao {

    Employee findById(int id);

    void saveEmployee(Employee employee);

    void deleteEmployeeBySsn(String ssn);

    List<Employee> findAllEmployees();

    Employee findEmployeeBySsn(String ssn);

}