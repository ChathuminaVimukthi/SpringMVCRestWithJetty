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

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-context.xml", "embedded-jetty-context.xml");
    }
}
