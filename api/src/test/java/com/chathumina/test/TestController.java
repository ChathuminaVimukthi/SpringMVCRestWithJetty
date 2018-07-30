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

package com.chathumina.test;

import com.chathumina.modal.Employee;
import com.chathumina.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:embedded-jetty-context.xml", "classpath:beans-context.xml"})
public class TestController {


    @Autowired
    private EmployeeService employeeService;

    @Test
    public void testDelete() {
        employeeService.deleteEmployee(51);
    }

    @Test
    public void testAdd(){
        Employee employee = new Employee();
        employee.setTelephone("11111");
        employee.setEmail("gsjdghs");
        employee.setName("fgefde");
        employee.setAddress("sdhfgsdjf");

        employeeService.addEmployee(employee);
    }

    @Test
    public void testGetList(){
        List<Employee> list = employeeService.getAllEmployees();
        for (Employee lst:list){
            System.out.println(lst.getId());
        }
    }

    @Test
    public void testGetEmployee(){
        Employee employee = employeeService.getEmployee(60);
        System.out.println("ID : "+employee.getId());
    }

}
