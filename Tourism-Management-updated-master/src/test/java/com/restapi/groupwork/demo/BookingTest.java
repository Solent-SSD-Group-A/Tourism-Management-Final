package com.restapi.groupwork.demo;

import com.restapi.groupwork.demo.model.Booking;
import com.restapi.groupwork.demo.model.Customer;
import com.restapi.groupwork.demo.service.BookingServiceI;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SpringBootTest
public class BookingTest extends  DemoApplicationTests {

    @Autowired
    private BookingServiceI bookingServiceI;


    @Test
    public void testCreateBooking() throws ParseException {

        Integer date = 20210110;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        Date d = simpleDateFormat.parse(date.toString());

        Booking booking = new Booking(1,"book1", d, "type1", 1);
        bookingServiceI.addBooking(booking);
    }

    @Test
    public void testUpdateBooking() throws ParseException {

        Integer date = 20210110;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        Date d = simpleDateFormat.parse(date.toString());

        Booking updatebooking = new Booking(1,"update book", d,"type updated",1);
        bookingServiceI.updateBooking(updatebooking);

    }

    @Test
    public void testDeleteBooking(){

        Integer id = 1;

        bookingServiceI.deleteBooking(id);

        System.out.println("Deleted Booking Succesfully.");

    }

    @Test
    public void testGetAllBookings(){

        List<Booking> bookingList = (List<Booking>) bookingServiceI.getAllBooking();

        for (Booking b: bookingList
        ) {

            Booking bb = new Booking();
            bb.setBooking_id(b.getBooking_id());
            bb.setBooking_name(b.getBooking_name());
            bb.setBooking_type(b.getBooking_type());
            bb.setDate(b.getDate());
            bb.setTbl_customer_customer_id(b.getTbl_customer_customer_id());

            System.out.println("Biiking is : " + bb);

        }


    }

}
