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

package com.chathumina.controller;


import com.chathumina.modal.Employee;
import com.chathumina.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.List;

@Path("/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @GET
    @Path("employee")
    @Produces(MediaType.APPLICATION_JSON)
    public Employee listEmployee() throws IOException {
        Employee employee = employeeService.getEmployee(52);
        return employee;
    }

    @GET
    @Path("test")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> listEmployees(){
        List<Employee> listEmployee = employeeService.getAllEmployees();
        return listEmployee;
    }

    @GET
    @Path("employee/{Id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Employee getEmployee(@PathParam("Id") int id){
        Employee employee = employeeService.getEmployee(id);
        return employee;
    }

    @POST
    @Path("create")
    @Produces(MediaType.APPLICATION_JSON)
    public Employee create(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }



}
