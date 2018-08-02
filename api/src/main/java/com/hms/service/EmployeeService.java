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

import com.hms.modal.Employee;

import java.util.List;

/**
 * Service layer interface
 */

public interface EmployeeService {

    /**
     * Method to add an Employee to db
     *
     * @param employee Employee object
     * @return newly created Employee object will be returned
     */
    Employee addEmployee(Employee employee);

    /**
     * Method to get all the Employees from db
     *
     * @return a List of Employee objects will be returned
     */
    List<Employee> getAllEmployees();

    /**
     * Method to delete an Employee when employeeId is given
     *
     * @param employeeId employeeId of the Employee to delete
     */
    void deleteEmployee(Integer employeeId);

    /**
     * Method to get an Employee object from db when employeeId is given
     *
     * @param employeeid employeeId of the Employee
     * @return Employee object will be returned
     */
    Employee getEmployee(int employeeid);

    /**
     * Method to update the details of an Employee
     *
     * @param employee Employee object to be updated
     * @return Employee object with updated details will be returned
     */
    Employee updateEmployee(Employee employee);

}
