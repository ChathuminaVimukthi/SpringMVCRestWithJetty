/*
 *
 *    (C) Copyright 2006-2007 hSenid Software International (Pvt) Limited.
 *    All Rights Reserved.
 *
 *    These materials are unpublished, proprietary, confidential source code of
 *    hSenid Software International (Pvt) Limited and constitute a TRADE SECRET
 *    of hSenid Software International (Pvt) Limited.
 *
 *    hSenid Software International (Pvt) Limited retains all title to and intellectual
 *    property rights in these materials.
 *
 *
 */

package com.hms.service;

import com.hms.dao.EmployeeDAO;
import com.hms.modal.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Implementation of the EmployeeService interface
 *
 * @Service marks the class that execute the logic
 * @Transactional to let Spring start and commit/rollback transactions
 */

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    //add an employee to db
    public Employee addEmployee(Employee employee) {
        employeeDAO.addEmployee(employee);
        return employee;
    }

    //get the list of all employees from db
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    //delete an employee from db
    @Transactional
    public void deleteEmployee(Integer employeeId) {
        employeeDAO.deleteEmployee(employeeId);
    }

    //get an employee from db
    @Transactional
    public Employee getEmployee(int employeeid) {
        return employeeDAO.getEmployee(employeeid);
    }

    //update the details of an employee in db
    @Transactional
    public Employee updateEmployee(Employee employee) {
        return employeeDAO.updateEmployee(employee);
    }

}
