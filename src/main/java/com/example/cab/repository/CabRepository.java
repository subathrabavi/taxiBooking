package com.example.cab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cab.entity.Cab;

public interface CabRepository extends JpaRepository<Cab, Integer>{

}
