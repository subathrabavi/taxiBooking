package com.example.cab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cab.entity.Cab;
import com.example.cab.entity.Round;
import com.example.cab.service.CabService;

@RestController
@CrossOrigin(origins="*")
public class CabController {
	@Autowired
	CabService cabs;
	
	@PostMapping(value="/oneway")
	public Cab bookcab(@RequestBody Cab book) {
		return cabs.bookcab(book);
		
	}
	@PostMapping(value="/round")
	public Round bookround(@RequestBody Round round ) {
		return cabs.bookround(round);
	}
	
	
}
