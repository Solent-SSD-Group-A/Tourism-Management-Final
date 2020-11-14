package com.restapi.groupwork.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//It used to specify the class is an entity and map to a database table
@Entity(name = "tbl_customer")
public class Customer {
    //It used to specify primary key of an entity
    @Id
    //It used to generate the primary key of an entity
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customer_id;
    private String customer_name;
    private String email_address;
    private int contact_number;

    public Customer() {

    }

    public Customer(int customer_id, String customer_name, String email_address, int contact_number) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.email_address = email_address;
        this.contact_number = contact_number;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public int getContact_number() {
        return contact_number;
    }

    public void setContact_number(int contact_number) {
        this.contact_number = contact_number;
    }
}
