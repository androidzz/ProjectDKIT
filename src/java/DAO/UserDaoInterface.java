/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Business.User;
import Exceptions.DaoException;

import java.util.ArrayList;

/**
 *
 * @author Lorenas Orleckas
 */
public interface UserDaoInterface {

    public ArrayList<User> findAllCustomers() throws DaoException ;

    public User findCustomerByEmailPassword(String eml, String pword) throws DaoException;

    public User findCustomerByEmail(String cEmail) throws DaoException;

    
}
