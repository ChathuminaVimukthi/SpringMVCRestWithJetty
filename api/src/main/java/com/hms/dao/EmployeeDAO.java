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

package com.hms.dao;

import com.hms.modal.Employee;

import java.util.List;

/**
 * @Auther Chathumina Vimukthi
 * <p>
 * Data Access Object Layer
 */

public interface EmployeeDAO {

    /**
     * Method to add an employee
     *
     * @param employee Employee object
     */
    void addEmployee(Employee employee);

    /**
     * Method to get all the employees from db
     *
     * @return a List of employees will be returned
     */
    List<Employee> getAllEmployees();

    /**
     * Method to delete an Employee
     *
     * @param employeeId employeeId of the Employee to delete
     */
    void deleteEmployee(Integer employeeId);

    /**
     * Method to update the details of an employee
     *
     * @param employee Employee Object to update the details
     * @return Employee object with updated details will be returned
     */
    Employee updateEmployee(Employee employee);

    /**
     * Method to get an Employee where ID is given
     *
     * @param employeeId EmployeeId of the Employee
     * @return Employee object with the given Id will be returned
     */
    Employee getEmployee(int employeeId);
}