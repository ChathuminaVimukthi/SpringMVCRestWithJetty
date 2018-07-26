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

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;

import java.util.Arrays;

public class EmbeddedServer {

    private Server server;

    public EmbeddedServer(String contextPath, int port, Object... resources) {
        server = new Server(port);

        ServletContextHandler contextHandler = new ServletContextHandler();
        contextHandler.setContextPath(contextPath);

        ResourceConfig rc = new ResourceConfig();
        Arrays.stream(resources).forEach(rc::register);

        ServletContainer servletContainer = new ServletContainer(rc);
        ServletHolder servletHolder = new ServletHolder(servletContainer);
        contextHandler.addServlet(servletHolder, "/*");

        server.setHandler(contextHandler);
    }

    public void start() throws Exception {
        server.start();
    }

    public void stop() throws Exception {
        server.stop();
    }

    public void join() throws Exception {
        server.join();
    }

}
