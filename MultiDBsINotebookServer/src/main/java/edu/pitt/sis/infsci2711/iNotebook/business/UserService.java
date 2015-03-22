/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.sis.infsci2711.iNotebook.business;

import java.sql.SQLException;

import edu.pitt.sis.infsci2711.iNotebook.dao.UserDAO;
import edu.pitt.sis.infsci2711.iNotebook.models.UserDBModel;

/**
 *
 * @author Wu
 */
public class UserService {

    // find user by id
    public UserDBModel findById(final int id) throws SQLException, Exception {
        UserDBModel result = UserDAO.findById(id);

        return result;
    }

    // add user to the database
    public UserDBModel add(final UserDBModel person) throws SQLException, Exception {
        UserDAO.save(person);

        return person;
    }

    // check username validation
    public boolean checkUserName(final String userName) throws Exception {
        
        boolean result = UserDAO.checkUserName(userName);

        return result;
    }

    // check username and password validation
    public UserDBModel checkUser(final UserDBModel person) throws Exception {
        UserDBModel result = UserDAO.checkUser(person);

        return result;
    }

}
