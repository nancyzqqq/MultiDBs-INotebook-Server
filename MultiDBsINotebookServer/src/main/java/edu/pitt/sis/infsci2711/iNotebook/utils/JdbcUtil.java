/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.sis.infsci2711.iNotebook.utils;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Wu
 */
public class JdbcUtil {

    public static final String DEFAULT_HOST = "localhost";

    public static final int DEFAULT_PORT = 3306;

    public static final String DEFAULT_USER = "root"; //CHANGE TO YOUR MYSQL USER NAME

    public static final String DEFAULT_PASSWOD = "12345"; // CHANGE TO YOUR MYSQL PASSWORD

    public static final String DEFAULT_DATABASE = "infsci2711_tutorial";

    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        return DriverManager.getConnection(getConnectionString(), DEFAULT_USER, DEFAULT_PASSWOD);
    }

    public static String getConnectionString() {
        return String.format("jdbc:mysql://%s:%d/%s", DEFAULT_HOST, DEFAULT_PORT, DEFAULT_DATABASE);
    }
}
