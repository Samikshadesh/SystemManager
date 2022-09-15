package com.Technosignia.Mopaso.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.Mopaso.entity.Booking;
import com.Technosignia.Mopaso.repository.BookingRepository;

@Service
public class BookingService {
	
	@Autowired
	BookingRepository bookingRepository;
	
	public Booking bookingCustomer(Booking booking)
	{
		return bookingRepository.save(booking);
	}
	
	public Booking getBooking(Long id)
	{
		Optional<Booking>obj=bookingRepository.findById(id);
		Booking bk=obj.get();
		return (bk);
	}
	
	public Booking updateBooking(Booking booking, Long id)
	{
		Optional<Booking>obj=bookingRepository.findById(id);
		Booking bk=obj.get();
		bk.setDestination(booking.getDestination());
		bk.setSource(booking.getSource());
		bk.setBooking_no(booking.getBooking_no());
		return bookingRepository.save(bk);
		
	}
	
	public String deleteBooking(Long id) 
	{
		Optional<Booking>obj=bookingRepository.findById(id);
		Booking bk=null;
		if(obj.isPresent()) 
		{
		 bk=obj.get();
		 bookingRepository.deleteById(id);
		 return "Record is deleted sucessfully......!";
		}
		else
		{
			return "Record is not present...!";
		}
	}

}
