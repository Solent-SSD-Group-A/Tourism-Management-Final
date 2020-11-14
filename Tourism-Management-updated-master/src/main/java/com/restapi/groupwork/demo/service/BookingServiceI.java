package com.restapi.groupwork.demo.service;

import com.restapi.groupwork.demo.model.Booking;

public interface BookingServiceI {

    public Iterable<Booking> getAllBooking();

    public Booking getBookingById(int id);

    public void addBooking(Booking booking);

    public int updateBooking(Booking booking);

    public void deleteBooking(int id);
}
