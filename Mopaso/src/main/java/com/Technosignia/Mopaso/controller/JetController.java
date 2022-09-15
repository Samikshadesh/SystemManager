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

import com.Technosignia.Mopaso.entity.Jet;
import com.Technosignia.Mopaso.service.JetService;

@RestController
public class JetController {
	
	@Autowired
	JetService jetService;
	
	@PostMapping("/jet")
	public Jet createJet(@RequestBody Jet jet)
	{
		return jetService.createJet(jet); 
	}
	
	@GetMapping("/jet/{id}")
	public Jet fetchJetDetails(@PathVariable Long id)
	{
		return jetService.fetchJet(id);
	}
	
	@PutMapping("/jet/{id}")
	public Jet UpdateJetdetails(@RequestBody Jet jet, @PathVariable Long id)
	{
		return jetService.UpdateJet(jet,id);
	}
	@DeleteMapping("/jet/{id}")
	public String deleteRecordBypath(@PathVariable Long id)
	{
		return jetService.deleteRecord(id);
	}

		

}
