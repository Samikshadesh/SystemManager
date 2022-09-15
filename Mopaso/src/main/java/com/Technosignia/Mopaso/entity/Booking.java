package com.Technosignia.Mopaso.entity;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Booking {
	
	@Id
	Long id;
	
	Long booking_no;
	
	String status;
	
	Date booking_date;
	
	@OneToOne
	Airport source;
	
	@OneToOne
	Airport destination;
	
    String stay_duration;
    
    @OneToOne
    Customer customer;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBooking_no() {
		return booking_no;
	}

	public void setBooking_no(Long booking_no) {
		this.booking_no = booking_no;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getBooking_date() {
		return booking_date;
	}

	public void setBooking_date(Date booking_date) {
		this.booking_date = booking_date;
	}

	

	
	public Airport getSource() {
		return source;
	}

	public void setSource(Airport source) {
		this.source = source;
	}

	public Airport getDestination() {
		return destination;
	}

	public void setDestination(Airport destination) {
		this.destination = destination;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getStay_duration() {
		return stay_duration;
	}

	public void setStay_duration(String stay_duration) {
		this.stay_duration = stay_duration;
	}

	
	
	
	
	
	

}
