package DAO;
/**
 *
 * @author Lorenas Orleckas
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Business.User;
import Exceptions.DaoException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserDao extends Dao {

    public List<User> findAllUsers()  throws DaoException{
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<User> users = new ArrayList<User>();

        try {
            //Get connection object using the methods in the super class (Dao.java)...
            con = this.getConnection();

            String query = "SELECT * FROM USERS";
            ps = con.prepareStatement(query);

            //Using a PreparedStatement to execute SQL...
            rs = ps.executeQuery();
            while (rs.next()) {
                SimpleDateFormat date = new SimpleDateFormat ("2014-02-14"); 
                
                int userId = rs.getInt("userId");
                String firstname = rs.getString("firstName");
                String lastname = rs.getString("lastName");
                java.sql.Date dob = rs.getDate("DOB");
                String a = date.format(dob);
                String addressLine1 = rs.getString("addressLine1");
                String addressLine2 = rs.getString("addressLine2");
                String city = rs.getString("city");
                String county = rs.getString("county");
                String postlCode = rs.getString("postalCode");
                String country = rs.getString("country");
                String phone = rs.getString("phone");
                String password = rs.getString("password");
                String email = rs.getString("email");
                boolean admin = rs.getBoolean("admin");
                

                User c = new User(userId, firstname, lastname, dob, addressLine1, addressLine2, city,
                county, postlCode, country, phone, password, email, admin );
                users.add(c);
            }
        } catch (SQLException e) {
            throw new DaoException("findAllUsers() " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    freeConnection(con);
                }
            } catch (SQLException e) {
                throw new DaoException("findAllUsers() final" + e.getMessage());
            }
        }
        return users;     
    }

    public User findUserByEmailPassword(String eml, String pword) throws DaoException{
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User c = null;
        try {
            con = this.getConnection();

            String query = "SELECT * FROM USERS WHERE EMAIL = ? AND PASSWORD = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, eml);
            ps.setString(2, pword);

            rs = ps.executeQuery();
            if (rs.next()) {
                int userId = rs.getInt("userId");
                String firstname = rs.getString("firstName");
                String lastname = rs.getString("lastName");
                java.sql.Date dob = rs.getDate("DOB");
                String addressLine1 = rs.getString("addressLine1");
                String addressLine2 = rs.getString("addressLine2");
                String city = rs.getString("city");
                String county = rs.getString("county");
                String postlCode = rs.getString("postalCode");
                String country = rs.getString("country");
                String phone = rs.getString("phone");
                String password = rs.getString("password");
                String email = rs.getString("email");
                boolean admin = rs.getBoolean("admin");

                c = new User(userId, firstname, lastname, dob, addressLine1, addressLine2, city,
                county, postlCode, country, phone, password, email, admin );

            }
        } catch (SQLException e) {
            throw new DaoException("findUserByEmailPassword " + e.getMessage());
        } catch (NullPointerException ex) {
            throw new DaoException("findUserByEmailPassword null pointer" + ex.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    freeConnection(con);
                }
            } catch (SQLException e) {
                throw new DaoException("findUserByEmailPassword final" + e.getMessage());
            }
        }
        return c;    
    }

    public User findUserByEmail(String cEmail) throws DaoException{
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User c = null;
        try {
            con = this.getConnection();

            String query = "SELECT * FROM USERS WHERE email = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, cEmail);

            rs = ps.executeQuery();
            if (rs.next()) {
                int userId = rs.getInt("userId");
                String firstname = rs.getString("firstName");
                String lastname = rs.getString("lastName");
                java.sql.Date dob = rs.getDate("DOB");
                String addressLine1 = rs.getString("addressLine1");
                String addressLine2 = rs.getString("addressLine2");
                String city = rs.getString("city");
                String county = rs.getString("county");
                String postlCode = rs.getString("postalCode");
                String country = rs.getString("country");
                String phone = rs.getString("phone");
                String password = rs.getString("password");
                String email = rs.getString("email");
                boolean admin = rs.getBoolean("admin");

                c = new User(userId, firstname, lastname, dob, addressLine1, addressLine2, city,
                county, postlCode, country, phone, password, email, admin );
            }
        } catch (SQLException e) {
            throw new DaoException("findUserByEmail:" + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    freeConnection(con);
                }
            } catch (SQLException e) {
                throw new DaoException("findUserByEmail final" + e.getMessage());
            }
        }
        return c;     
    }
    
   
}
