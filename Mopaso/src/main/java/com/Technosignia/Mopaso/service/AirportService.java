package com.Technosignia.Mopaso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

import com.Technosignia.Mopaso.entity.Airport;
import com.Technosignia.Mopaso.repository.AirportRepository;

@Service
public class AirportService {
	
	@Autowired
	AirportRepository airportRepository;
	
	public Airport createAirport(Airport airport)
	{
		System.out.println("Inside createAirport");
		return airportRepository.save(airport);
	}
	
	public Airport getAirportById(Long id) {
		System.out.println("Inside getAirportById");
		Optional<Airport> opAirport = airportRepository.findById(id);
		Airport air=opAirport.get();
		return air;
	}
	public Airport updateAirportById(Airport airport,Long id )
	{
		Optional<Airport>opAirport=airportRepository.findById(id);
		Airport air=opAirport.get();
		
		
		air.setName(airport.getName());
		air.setAddress(airport.getAddress());
		air.setId(airport.getId());
		
		
		return airportRepository.save(air);
		
	}
	
	public String deleteAirport(Long id)
	{
		Optional<Airport>opAirport=airportRepository.findById(id);
		Airport air=null;
		if(opAirport.isPresent())
		{
			air=opAirport.get();
			airportRepository.deleteById(id);
			return"record is deleted sucessfully...!";
		}
		else
		{
			return"record is absent...!";
		}
		
	}
	
}
