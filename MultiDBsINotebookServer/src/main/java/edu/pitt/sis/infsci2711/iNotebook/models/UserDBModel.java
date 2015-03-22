/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.sis.infsci2711.iNotebook.models;

/**
 *
 * @author Wu
 */
public class UserDBModel {
    
    private int id;
    private String userName;
    private String password;
    
    public UserDBModel() {
    }
    
    public UserDBModel(final String userName) {
        this.setUserName(userName);
        this.setPassword(password);
    }
    
    public UserDBModel(final int id, final String userName, final String password) {
        this.setId(id);
        this.setUserName(userName);
        this.setPassword(password);
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(final int id) {
        this.id = id;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
