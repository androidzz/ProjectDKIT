/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Business.User;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lorenas Orleckas D00157671
 */
public class UserDaoTest {

    User a = new User(123, "firstName", "lastName", Date.valueOf(LocalDate.now()), "addressLine1", "addressLine2", "city", "county", "postalCode", "country", "phone", "password", "email", true);

    public UserDaoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of displayAllMovies method, of class MovieDao.
     */
    @Test
    public void testFindAllUsersNotNull() throws Exception {
        System.out.println("Test that findAllUsers() return not Null");
        UserDao instance = new UserDao();
        List<User> result = instance.findAllUsers();
        assertNotNull(result);

    }

    /**
     * Test of findAllUsers method, of class UserDao.
     */
    @Test
    public void testFindAllUsers() throws Exception {
        System.out.println("findAllUsers");
        UserDao instance = new UserDao();
        List<User> result = instance.findAllUsers();
        assertEquals("Vitalijus", result.get(0).getFirstName());

    }

    /**
     * Test of findUserByEmailPassword method, of class UserDao.
     */
    @Test
    public void testFindUserByEmailPassword() throws Exception {
        System.out.println("findUserByEmailPassword");
        String eml = "Vitalijus@gmail.com";
        String pword = "Password1";        
        UserDao instance = new UserDao();
        User expResult = instance.findAllUsers().get(0);     
        User result = instance.findUserByEmailPassword(eml, pword); 
        assertEquals(expResult, result);

    }
    /**
     * Test of testFindUserByEmailPasswordNotNull method, of class UserDao.
     */
    @Test
    public void testFindUserByEmailPasswordNotNull() throws Exception {
        System.out.println("testFindUserByEmailPasswordNotNull");
        String eml = "Vitalijus@gmail.com";
        String pword = "Password1";        
        UserDao instance = new UserDao();   
        User result = instance.findUserByEmailPassword(eml, pword); 
        assertNotNull(result);
    }
        /**
     * Test of testFindUserByEmailPasswordNull method, of class UserDao.
     */
    @Test
    public void testFindUserByEmailPasswordNull() throws Exception {
        System.out.println("testFindUserByEmailPasswordNotNull");
        String eml = "aaa";
        String pword = "aaa";        
        UserDao instance = new UserDao();   
        User result = instance.findUserByEmailPassword(eml, pword); 
        assertNull(result);
    }
    /**
     * Test of findUserByEmail method, of class UserDao.
     */
    @Test
    public void testFindUserByEmail() throws Exception {
        System.out.println("findUserByEmail");
        String cEmail = "Vitalijus@gmail.com";
        UserDao instance = new UserDao();
        User expResult = instance.findAllUsers().get(0);
        User result = instance.findUserByEmail(cEmail);
        assertEquals(expResult, result);
    }
        /**
     * Test of testFindUserByEmailNotNull method, of class UserDao.
     */
    @Test
    public void testFindUserByEmailNotNull() throws Exception {
        System.out.println("testFindUserByEmailNotNull");
        String cEmail = "Vitalijus@gmail.com";
        UserDao instance = new UserDao();
        User result = instance.findUserByEmail(cEmail);
        assertNotNull( result);
    }
            /**
     * Test of testFindUserByEmailNull method, of class UserDao.
     */
    @Test
    public void testFindUserByEmailNull() throws Exception {
        System.out.println("testFindUserByEmailNull");
        String cEmail = "qqq";
        UserDao instance = new UserDao();
        User result = instance.findUserByEmail(cEmail);
        assertNull( result);
    }
    
    
}
