package com.sadman.springmvc.service;

import java.util.List;

import com.sadman.springmvc.model.Employee;
import com.sadman.springmvc.model.VerificationToken;
import org.springframework.stereotype.Service;


public interface EmployeeService {

    Employee findById(int id);

    void saveEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void deleteEmployeeBySsn(String ssn);

    List<Employee> findAllEmployees();

    Employee findEmployeeBySsn(String ssn);

    boolean isEmployeeSsnUnique(Integer id, String ssn);

    void sendMail(Employee employee, String verificationToken);

    VerificationToken getVerificationToken(Integer VerificationToken);

    void createVerificationTokenForUser(Employee employee, String token);

    void generateVerificationToken(Employee employee, String verificationToken);
}
