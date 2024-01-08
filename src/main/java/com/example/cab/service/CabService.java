package com.example.cab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cab.dao.CabDao;
import com.example.cab.entity.Cab;
import com.example.cab.entity.Round;
@Service
public class CabService {
@Autowired
CabDao cabd;
 
	public Cab bookcab(Cab book) {
		
		return cabd.bookcab(book);
	}

	public Round bookround(Round round) {
		return cabd.bookround(round);
	}

}
