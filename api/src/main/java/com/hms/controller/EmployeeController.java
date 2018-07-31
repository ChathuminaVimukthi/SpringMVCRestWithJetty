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

package com.hms.controller;


import com.hms.modal.Employee;
import com.hms.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @GET
    @Path("test")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> listEmployees() {
        return employeeService.getAllEmployees();
    }

    @GET
    @Path("employee/{Id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Employee getEmployee(@PathParam("Id") int id) {
        return employeeService.getEmployee(id);
    }

    @POST
    @Path("create")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public Employee create(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }


    @DELETE
    @Path("delete/{Id}")
    @Produces(MediaType.TEXT_HTML)
    public String deleteEmployee(@PathParam("Id") int id) {
        if (employeeService.getEmployee(id) == null) {
            return "No user with " + id;
        } else {
            Employee employee = employeeService.getEmployee(id);
            employeeService.deleteEmployee(id);
            return "Employee with ID " + employee.getId() + " deleted Successfully";
        }
    }

    @PUT
    @Path("update/{Id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Employee updateEmployee(@RequestBody Employee employee, @PathParam("Id") int id) {
        employee.setId(id);
        return employeeService.updateEmployee(employee);
    }


}
