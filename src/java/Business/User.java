/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author Lorenas Orleckas D00157671
 */
public class User {

    private int userId;
    private String firstName;
    private String lastName;
    private Date DOB;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String county;
    private String postlCode;
    private String country;
    private String phone;
    private String password;
    private String email;
    private boolean admin;

    public User() {
    }

    public User(int userId, String firstName, String lastName, Date DOB, String addressLine1, String addressLine2, String city, String county, String postlCode, String country, String phone, String password, String email, boolean admin) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.county = county;
        this.postlCode = postlCode;
        this.country = country;
        this.phone = phone;
        this.password = password;
        this.email = email;
        this.admin = admin;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getPostlCode() {
        return postlCode;
    }

    public void setPostlCode(String postlCode) {
        this.postlCode = postlCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.userId;
        hash = 29 * hash + Objects.hashCode(this.firstName);
        hash = 29 * hash + Objects.hashCode(this.lastName);
        hash = 29 * hash + Objects.hashCode(this.DOB);
        hash = 29 * hash + Objects.hashCode(this.addressLine1);
        hash = 29 * hash + Objects.hashCode(this.addressLine2);
        hash = 29 * hash + Objects.hashCode(this.city);
        hash = 29 * hash + Objects.hashCode(this.county);
        hash = 29 * hash + Objects.hashCode(this.postlCode);
        hash = 29 * hash + Objects.hashCode(this.country);
        hash = 29 * hash + Objects.hashCode(this.phone);
        hash = 29 * hash + Objects.hashCode(this.password);
        hash = 29 * hash + Objects.hashCode(this.email);
        hash = 29 * hash + (this.admin ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (this.userId != other.userId) {
            return false;
        }
        if (this.admin != other.admin) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.addressLine1, other.addressLine1)) {
            return false;
        }
        if (!Objects.equals(this.addressLine2, other.addressLine2)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        if (!Objects.equals(this.county, other.county)) {
            return false;
        }
        if (!Objects.equals(this.postlCode, other.postlCode)) {
            return false;
        }
        if (!Objects.equals(this.country, other.country)) {
            return false;
        }
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.DOB, other.DOB)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", DOB=" + DOB + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", city=" + city + ", county=" + county + ", postlCode=" + postlCode + ", country=" + country + ", phone=" + phone + ", password=" + password + ", email=" + email + ", admin=" + admin + '}';
    }

}
