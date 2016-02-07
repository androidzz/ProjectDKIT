/**
 *
 * @author Lorenas Orleckas
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
