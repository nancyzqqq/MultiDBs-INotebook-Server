/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.sis.infsci2711.iNotebook;

import edu.pitt.sis.infsci2711.multidbs.utils.JerseyJettyServer;
/**
 *
 * @author Wu
 */
public class MyServer {

    private static final int serverPort = 8082;

    public static void main(final String[] args) throws Exception {
        JerseyJettyServer server = new JerseyJettyServer(serverPort, "edu.pitt.sis.infsci2711.iNotebook.rest");
        server.start();
    }
}
