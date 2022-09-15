package com.Technosignia.Mopaso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Technosignia.Mopaso.entity.Booking;
import com.Technosignia.Mopaso.service.BookingService;

@RestController
public class BookingController {
	
	@Autowired
	BookingService bookingservice;
	
	@PostMapping("/booking")
	public Booking bookingCustomer(@RequestBody Booking booking )
	{
		return bookingservice.bookingCustomer(booking);
	}
	
	@GetMapping("/booking")
	public Booking getbookingdetails(@RequestParam Long id)
	{
		return bookingservice.getBooking(id);
	}
	
	@PutMapping("/booking")
	public Booking updateBookingdetalis(@RequestBody Booking booking, @RequestParam Long id)
	{
		return bookingservice.updateBooking(booking,id);
	}
	
	@DeleteMapping("/booking")
	public String deleteBooking(@RequestParam Long id)
	{
		return bookingservice.deleteBooking(id);
		
	}

}
