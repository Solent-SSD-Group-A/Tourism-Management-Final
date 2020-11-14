package com.restapi.groupwork.demo.controller;

import com.restapi.groupwork.demo.dao.BookingRepository;
import com.restapi.groupwork.demo.model.Booking;
import com.restapi.groupwork.demo.model.User;
import com.restapi.groupwork.demo.service.BookingService;
import com.restapi.groupwork.demo.service.BookingServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //It marks the class as a controller where every method returns a domain object instead of a view
@RequestMapping("/booking") //handle the request
public class BookingController {

    @Autowired
    private BookingServiceI bookingService;


    @GetMapping //It used to handle the HTTP get request
    public Iterable<Booking> getAllBooking() {
        return bookingService.getAllBooking();
    }

    @GetMapping("/{id}")
    public Booking getBookingById(@PathVariable("id") int id) {
        return bookingService.getBookingById(id);
    }

    @PostMapping  //It used to handle the HTTP post request
    public void addBooking(@RequestBody Booking booking) {
        bookingService.addBooking(booking);
    }

    @PutMapping //It used handle the HTTP put request
    public int updateBooking(@RequestBody Booking booking) {
        return bookingService.updateBooking(booking);
    }

    @DeleteMapping("/{id}") //It used to handle the HTTP delete request
    public void deleteBooking(@PathVariable int id) {
        bookingService.deleteBooking(id);
    }
}
