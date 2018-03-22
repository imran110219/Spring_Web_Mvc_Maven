package com.sadman.springmvc.service;

import java.util.List;

import com.sadman.springmvc.model.Employee;
import org.springframework.stereotype.Service;

public interface EmployeeService {

    Employee findById(int id);

    void saveEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void deleteEmployeeBySsn(String ssn);

    List<Employee> findAllEmployees();

    Employee findEmployeeBySsn(String ssn);

    boolean isEmployeeSsnUnique(Integer id, String ssn);

    void sendMail(String email);

}
