/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
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
public class UserTest {

    

    

    User c = new User(123, "firstName", "lastName", Date.valueOf(LocalDate.now()), "addressLine1", "addressLine2", "city", "county", "postalCode", "country", "phone", "password", "email", true);
    User a = new User(123, "firstName", "lastName", Date.valueOf(LocalDate.now()), "addressLine1", "addressLine2", "city", "county", "postalCode", "country", "phone", "password", "email", true);

    public UserTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        c.toString();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getUserId method, of class User.
     */
    @Test
    public void testGetUserId() {
        System.out.println("getUserId");
        int expResult = 123;
        int result = c.getUserId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUserId method, of class User.
     */
    @Test
    public void testSetUserId() {
        System.out.println("setUserId");
        c.setUserId(111);
        assertEquals(111, c.getUserId());
    }

    /**
     * Test of getFirstName method, of class User.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        String expResult = "firstName";
        String result = c.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFirstName method, of class User.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        c.setFirstName("abc");
        assertEquals("abc", c.getFirstName());
    }

    /**
     * Test of getLastName method, of class User.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        String expResult = "lastName";
        String result = c.getLastName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLastName method, of class User.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        c.setLastName("zzz");
        assertEquals("zzz", c.getLastName());
    }

    /**
     * Test of getDOB method, of class User.
     */
    @Test
    public void testGetDOB() {

        System.out.println("getDOB");
        Date expResult = Date.valueOf(LocalDate.now());
        Date result = c.getDOB();
        assertEquals(expResult, result);

    }

//    /**
//     * Test of setDOB method, of class User.
//     */
//    @Test
//    public void testSetDOB() {
//        System.out.println("setDOB");
//        Date DOB = null;
//        User instance = new User();
//        instance.setDOB(DOB);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
    /**
     * Test of getAddressLine1 method, of class User.
     */
    @Test
    public void testGetAddressLine1() {
        System.out.println("getAddressLine1");
        String expResult = "addressLine1";
        String result = c.getAddressLine1();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAddressLine1 method, of class User.
     */
    @Test
    public void testSetAddressLine1() {
        System.out.println("setAddressLine1");
        c.setAddressLine1("qqq");
        assertEquals("qqq", c.getAddressLine1());
    }

    /**
     * Test of getAddressLine2 method, of class User.
     */
    @Test
    public void testGetAddressLine2() {
        System.out.println("getAddressLine2");
        String expResult = "addressLine2";
        String result = c.getAddressLine2();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAddressLine2 method, of class User.
     */
    @Test
    public void testSetAddressLine2() {
        System.out.println("setAddressLine2");
        c.setAddressLine2("eee");
        assertEquals("eee", c.getAddressLine2());
    }

    /**
     * Test of getCity method, of class User.
     */
    @Test
    public void testGetCity() {
        System.out.println("getCity");
        String expResult = "city";
        String result = c.getCity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCity method, of class User.
     */
    @Test
    public void testSetCity() {
        System.out.println("setCity");
        c.setCity("ccc");
        assertEquals("ccc", c.getCity());
    }

    /**
     * Test of getCounty method, of class User.
     */
    @Test
    public void testGetCounty() {
        System.out.println("getCounty");
        String expResult = "county";
        String result = c.getCounty();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCounty method, of class User.
     */
    @Test
    public void testSetCounty() {
        System.out.println("setCounty");
        c.setCounty("xxx");
        assertEquals("xxx", c.getCounty());
    }

    /**
     * Test of getPostlCode method, of class User.
     */
    @Test
    public void testGetPostlCode() {
        System.out.println("getPostalCode");
        String expResult = "postalCode";
        String result = c.getPostalCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPostlCode method, of class User.
     */
    @Test
    public void testSetPostlCode() {
        System.out.println("setPostlCode");
        c.setPostalCode("qwe");
        assertEquals("qwe", c.getPostalCode());
    }

    /**
     * Test of getCountry method, of class User.
     */
    @Test
    public void testGetCountry() {
        System.out.println("getCountry");
        String expResult = "country";
        String result = c.getCountry();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCountry method, of class User.
     */
    @Test
    public void testSetCountry() {
        System.out.println("setCountry");
        c.setCountry("ggg");
        assertEquals("ggg", c.getCountry());
    }

    /**
     * Test of getPhone method, of class User.
     */
    @Test
    public void testGetPhone() {
        System.out.println("getPhone");
        String expResult = "phone";
        String result = c.getPhone();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPhone method, of class User.
     */
    @Test
    public void testSetPhone() {
        System.out.println("setPhone");
        c.setPhone("123");
        assertEquals("123", c.getPhone());
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        String expResult = "password";
        String result = c.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        c.setPassword("pass");
        assertEquals("pass", c.getPassword());
    }

    /**
     * Test of getEmail method, of class User.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        String expResult = "email";
        String result = c.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmail method, of class User.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        c.setEmail("eee");
        assertEquals("eee", c.getEmail());
    }

    /**
     * Test of isAdmin method, of class User.
     */
    @Test
    public void testIsAdmin() {
        System.out.println("isAdmin");
        boolean expResult = true;
        boolean result = c.isAdmin();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAdmin method, of class User.
     */
    @Test
    public void testSetAdmin() {
        System.out.println("setAdmin");
        c.setAdmin(false);
        assertEquals(false, c.isAdmin());
    }

//    /**
//     * Test of hashCode method, of class User.
//     */
//    @Test
//    public void testHashCode() {
//        System.out.println("hashCode");
//        int expResult = -1477928704;
//        int result = c.hashCode();
//        assertEquals(expResult, result);
//    }

    /**
     * Test of equals method, of class User.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        boolean expResult = true;
        boolean result = c.equals(a);
        assertEquals(expResult, result);
    }

}
