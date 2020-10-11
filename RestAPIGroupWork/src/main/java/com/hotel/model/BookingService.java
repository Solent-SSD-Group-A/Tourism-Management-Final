package com.hotel.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

	@Autowired
	private BookingRepository repo;
	
	public List<Booking> listAll(){
		return repo.findAll();
	}
	
	public void save(Booking booking) {
		repo.save(booking);
	}
	
	public Booking get(Integer id) {
		return repo.findById(id).get();
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	
	
}
