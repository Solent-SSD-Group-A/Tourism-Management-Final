package com.restapi.groupwork.demo.dao;

import com.restapi.groupwork.demo.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
}
