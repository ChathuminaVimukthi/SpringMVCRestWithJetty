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

public interface EmployeeDAO {

    public void addEmployee(Employee employee);

    public List<Employee> getAllEmployees();

    public void deleteEmployee(Integer employeeId);

    public Employee updateEmployee(Employee employee);

    public Employee getEmployee(int employeeid);
}