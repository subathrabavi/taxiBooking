package com.example.cab.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.cab.entity.Cab;
import com.example.cab.entity.Round;
import com.example.cab.repository.CabRepository;
import com.example.cab.repository.RoundRepository;
@Repository
public class CabDao {
@Autowired
CabRepository cabr;
@Autowired
RoundRepository roundr;
	public Cab bookcab(Cab book) {
		
		return cabr.save(book);
	}
	public Round bookround(Round round) {
		
		return roundr.save(round);
	}

}
