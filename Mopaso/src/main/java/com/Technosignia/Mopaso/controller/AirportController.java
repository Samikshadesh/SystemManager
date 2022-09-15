package com.Technosignia.Mopaso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Technosignia.Mopaso.entity.Airport;
import com.Technosignia.Mopaso.service.AirportService;

@RestController
public class AirportController {
	
	@Autowired
	AirportService airportService;
	
	@PostMapping("/airport")
	public Airport createAirPort(@RequestBody Airport airport) {
		//System.out.println("==============================================");
		//System.out.println("createAirPort In controller: "+airport.toString());
		return airportService.createAirport(airport);
	}
	
	@GetMapping("/airport/{id}")
	public Airport getAirportById(@PathVariable Long id)    //by path   variable 
	{
		System.out.println("route getAirportById");
		return airportService.getAirportById(id);
	}
	
	@PutMapping("/airport")
	public Airport updateAirportById(@RequestBody Airport airport, @RequestParam Long id)  //request param
	{
		return airportService.updateAirportById(airport,id);
	}
	
	@DeleteMapping("/airport/{id}")
	public String deleteAirport(@PathVariable Long id){
		return airportService.deleteAirport(id);
		
	}
	


}
