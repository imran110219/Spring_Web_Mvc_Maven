package com.sadman.springmvc.service;

import java.util.List;
import java.util.UUID;

import com.sadman.springmvc.dao.VerificationTokenDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sadman.springmvc.dao.EmployeeDao;

import com.sadman.springmvc.model.Employee;
import com.sadman.springmvc.model.VerificationToken;

@Transactional
@Service("EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao dao;

    @Autowired
    public JavaMailSender emailSender;

    @Autowired
    private VerificationTokenDao tokenDao;




    public Employee findById(int id) {
        return dao.findById(id);
    }

    public void saveEmployee(Employee employee) {
        dao.saveEmployee(employee);
    }

    /*
     * Since the method is running with Transaction, No need to call hibernate update explicitly.
     * Just fetch the entity from db and update it with proper values within transaction.
     * It will be updated in db once transaction ends.
     */
    public void updateEmployee(Employee employee) {
        Employee entity = dao.findById(employee.getId());
        if(entity!=null){
            entity.setFullName(employee.getFullName());
            entity.setName(employee.getName());
            entity.setJoiningDate(employee.getJoiningDate());
            entity.setSalary(employee.getSalary());
            entity.setSsn(employee.getSsn());
        }
    }

    public void deleteEmployeeBySsn(String ssn) {
        dao.deleteEmployeeBySsn(ssn);
    }

    public List<Employee> findAllEmployees() {
        return dao.findAllEmployees();
    }

    public Employee findEmployeeBySsn(String ssn) {
        return dao.findEmployeeBySsn(ssn);
    }

    public boolean isEmployeeSsnUnique(Integer id, String ssn) {
        Employee employee = findEmployeeBySsn(ssn);
        return ( employee == null || ((id != null) && (employee.getId() == id)));
    }

    public void sendMail(Employee employee, String verificationToken) {

        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(employee.getName());
//        message.setFrom("sadman@assassin.com");
        message.setReplyTo("sadman@assassin.com");
        message.setSubject("Registration Confirmation");
        message.setText("This is the test message for testing gmail smtp server using spring mail " + verificationToken);

        emailSender.send(message);

    }

    @Override
    public VerificationToken getVerificationToken(final Integer VerificationToken) {
        return tokenDao.findByToken(VerificationToken);
    }

    @Override
    public void createVerificationTokenForUser(final Employee employee, final String token) {
        final VerificationToken myToken = new VerificationToken(token, employee);
        tokenDao.saveToken(myToken);
    }

    @Override
    public void generateVerificationToken(final Employee employee, final String verificationToken) {
        VerificationToken vToken = new VerificationToken();
        vToken.setEmployee(employee);
        vToken.updateToken(verificationToken);
        tokenDao.saveToken(vToken);
    }

}
