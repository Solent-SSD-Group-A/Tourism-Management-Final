package com.hotel.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Booking {

	private Integer booking_id;
	private String booking_name;
	private Date booking_type;
	
	public Booking() {
	
	}

	public Booking(Integer booking_id, String booking_name, Date booking_type) {
		super();
		this.booking_id = booking_id;
		this.booking_name = booking_name;
		this.booking_type = booking_type;
	}
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(Integer booking_id) {
		this.booking_id = booking_id;
	}

	public String getBooking_name() {
		return booking_name;
	}

	public void setBooking_name(String booking_name) {
		this.booking_name = booking_name;
	}

	public Date getBooking_type() {
		return booking_type;
	}

	public void setBooking_type(Date booking_type) {
		this.booking_type = booking_type;
	}
	
	
	
	
}
