package com.Technosignia.Mopaso.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.Mopaso.entity.Jet;
import com.Technosignia.Mopaso.repository.JetRepository;

@Service
public class JetService {
	
	@Autowired
	JetRepository jetRepository;
	
	public Jet createJet(Jet jet)
	{
		return jetRepository.save(jet);
	}
	
	
	public Jet fetchJet(Long id)
	{
		Optional<Jet>obj=jetRepository.findById(id);
		Jet jr=obj.get();
		return (jr);
	}
	
	public Jet UpdateJet(Jet jet, Long id)
	{
		Optional<Jet>obj=jetRepository.findById(id);
		Jet jr=obj.get();
		jr.setName(jet.getName());
		jr.setType(jet.getType());
		return jetRepository.save(jr);
	}
	
	public String deleteRecord(Long id)
	{
		Optional<Jet>obj=jetRepository.findById(id);
		Jet jr=null;
		if(obj.isPresent())
		{
			jr=obj.get();
			jetRepository.deleteById(id);
			return "Record deleted sucessfully...!"; 
		}
		else
		{
			return"Record is not present...!";
		}
		
	}
	

	

}
