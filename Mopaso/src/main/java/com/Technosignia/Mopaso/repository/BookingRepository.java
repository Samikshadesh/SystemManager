package com.Technosignia.Mopaso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Technosignia.Mopaso.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {

}
