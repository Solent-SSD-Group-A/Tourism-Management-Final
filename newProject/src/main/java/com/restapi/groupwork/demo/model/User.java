package com.restapi.groupwork.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tbl_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;
    private String first_name;
    private String 	last_name;
    private String 	Date_of_birth;
    private int Contact;
    private String Gender;
    private String 	email_address;
    private String 	Password;

    public User(){

    }

    public User(int user_id, String first_name, String last_name, String date_of_birth, int contact, String gender, String email_address, String password) {
        this.user_id = user_id;
        this.first_name = first_name;
        this.last_name = last_name;
        Date_of_birth = date_of_birth;
        Contact = contact;
        Gender = gender;
        this.email_address = email_address;
        Password = password;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getDate_of_birth() {
        return Date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        Date_of_birth = date_of_birth;
    }

    public int getContact() {
        return Contact;
    }

    public void setContact(int contact) {
        Contact = contact;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
