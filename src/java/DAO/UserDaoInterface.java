
package DAO;

import Business.User;
import Exceptions.DaoException;

import java.util.ArrayList;

/**
 *
 * @author Lorenas Orleckas
 */
public interface UserDaoInterface {

    public ArrayList<User> findAllUsers() throws DaoException ;

    public User findUserByEmailPassword(String eml, String pword) throws DaoException;

    public User findUserByEmail(String cEmail) throws DaoException;

    
}
