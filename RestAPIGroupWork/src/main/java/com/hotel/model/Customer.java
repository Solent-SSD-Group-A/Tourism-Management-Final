package com.hotel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

	private Integer customer_id;
	private String user_name;
	private String user_address;
	private Integer contact_number;

	public Customer() {

	}

	public Customer(Integer customer_id, String user_name, String user_address, Integer contact_number) {
		super();
		this.customer_id = customer_id;
		this.user_name = user_name;
		this.user_address = user_address;
		this.contact_number = contact_number;
	}
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public Integer getContact_number() {
		return contact_number;
	}

	public void setContact_number(Integer contact_number) {
		this.contact_number = contact_number;
	}

}
