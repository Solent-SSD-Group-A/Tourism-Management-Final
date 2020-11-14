package com.restapi.groupwork.demo.service.impl;

import com.restapi.groupwork.demo.dao.BookingRepository;
import com.restapi.groupwork.demo.model.Booking;
import com.restapi.groupwork.demo.service.BookingServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BookingServiceImpl implements BookingServiceI {

    @Autowired
    BookingRepository bookingRepository;

    @Override
    public Iterable<Booking> getAllBooking() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking getBookingById(int id) {
        return bookingRepository.findById(id).get();
    }

    @Override
    public void addBooking(Booking booking) {
        bookingRepository.save(booking);
    }

    @Override
    public int updateBooking(Booking booking) {
        if (booking != null) {
            bookingRepository.save(booking);
            return -1;
        }

        return -1;
    }

    @Override
    public void deleteBooking(int id) {
        bookingRepository.deleteById(id);
    }


}
