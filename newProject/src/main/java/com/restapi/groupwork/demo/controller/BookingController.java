package com.restapi.groupwork.demo.controller;

import com.restapi.groupwork.demo.dao.BookingRepository;
import com.restapi.groupwork.demo.model.Booking;
import com.restapi.groupwork.demo.model.User;
import com.restapi.groupwork.demo.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    BookingService bookingService;

    @GetMapping
    public Iterable<Booking> getAllBooking(){
        return bookingService.getAllBooking();
    }
    @GetMapping("/{id}")
    public Booking getBookingById(@PathVariable("id") int id){
        return bookingService.getBookingById(id);
    }

    @PostMapping
    public void addBooking(@RequestBody Booking booking){
        bookingService.addBooking(booking);
    }

    @PutMapping
    public int updateBooking(@RequestBody Booking booking){
        return bookingService.updateBooking(booking);
    }

    @DeleteMapping("/{id}")
    public void deleteBooking(@PathVariable int id){
       bookingService.deleteBooking(id);
    }
}
