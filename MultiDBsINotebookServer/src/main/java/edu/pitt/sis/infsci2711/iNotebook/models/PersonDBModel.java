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
public class PersonDBModel {

    private int id;
    private String firstName;
    private String lastName;

    public PersonDBModel() {

    }

    public PersonDBModel(final String firstName, final String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public PersonDBModel(final int id, final String firstName, final String lastName) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }
}
