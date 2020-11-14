package com.restapi.groupwork.demo.service;

import com.restapi.groupwork.demo.dao.BookingRepository;
import com.restapi.groupwork.demo.model.Booking;
import com.restapi.groupwork.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;

@Service
public class BookingService {

    /*

    @Autowired
    BookingRepository bookingRepository;

    public Iterable<Booking> getAllBooking(){
        return bookingRepository.findAll();
    }

    public Booking getBookingById(int id){
        return bookingRepository.findById(id).get();
    }

    public void addBooking(Booking booking){
       bookingRepository.save(booking);
    }

    public int updateBooking(Booking booking){
        if(booking != null){
            bookingRepository.save(booking);
            return -1;
        }

        return -1;
    }

    public void deleteBooking(int id){
        bookingRepository.deleteById(id);
    }

    */
}
