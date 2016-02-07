package Service;

import java.util.List;

import Business.User;
import DAO.UserDao;
import Exceptions.DaoException;


public class UserService 
{	
    public User login(String email, String password) 
    {
        User c = null;
        try 
        {
            UserDao dao = new UserDao();
            c = dao.findUserByEmailPassword(email, password);
        } 
        catch (DaoException e) 
        {
            System.out.println("public Customer login(String email, String password)" + e.getMessage());
        }
        
        return c;
    }
	
    public List<User> getAllUsers() 
    {
        List<User> customers = null;
        try 
        {
            UserDao dao = new UserDao();
            customers = dao.findAllUsers();
        } 
        catch (DaoException e) 
        {
            System.out.println("public List<Customer> getAllUsers()"  + e.getMessage());
        }
        return customers;	
    }	
}