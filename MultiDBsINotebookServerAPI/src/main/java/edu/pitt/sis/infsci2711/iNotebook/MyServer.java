/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.sis.infsci2711.iNotebook;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;

/**
 *
 * @author Wu
 */
public class MyServer {
    private static final int serverPort = 8082;
    public static void main(String[] args) {
        System.out.println("Hello world");
        ResourceConfig resourceConfig = new ResourceConfig();
        resourceConfig.packages("edu.pitt.sis.infsci2711.iNotebook.rest");
        ServletContainer servletContainer = new ServletContainer(resourceConfig);
        ServletHolder sh = new ServletHolder(servletContainer);
        Server server = new Server(serverPort);
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        context.addServlet(sh, "/*");
        server.setHandler(context);
        try {
            server.start();
            server.join();
        } catch (Exception ex) {
            System.out.println("Server start fail");
            Logger.getLogger(MyServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
