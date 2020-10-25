package com.restapi.groupwork.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "tbl_booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int booking_id;
    private String booking_name;
    private Date date;
    private String booking_type;
    private int tbl_customer_customer_id;

    public Booking(){

    }

    public Booking(int booking_id, String booking_name, Date date, String booking_type, int tbl_customer_customer_id) {
        this.booking_id = booking_id;
        this.booking_name = booking_name;
        this.date = date;
        this.booking_type = booking_type;
        this.tbl_customer_customer_id = tbl_customer_customer_id;
    }

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public String getBooking_name() {
        return booking_name;
    }

    public void setBooking_name(String booking_name) {
        this.booking_name = booking_name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getBooking_type() {
        return booking_type;
    }

    public void setBooking_type(String booking_type) {
        this.booking_type = booking_type;
    }

    public int getTbl_customer_customer_id() {
        return tbl_customer_customer_id;
    }

    public void setTbl_customer_customer_id(int tbl_customer_customer_id) {
        this.tbl_customer_customer_id = tbl_customer_customer_id;
    }
}
