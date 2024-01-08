package com.example.cab.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="round")
public class Round {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private int id;
	private String name;
	private long phone;
	private String carType;
	private String pickupCity;
	private String pickupDate;
	private String pickupTime; 
	private String dropCity;
	private String dropDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public String getPickupCity() {
		return pickupCity;
	}
	public void setPickupCity(String pickupCity) {
		this.pickupCity = pickupCity;
	}
	public String getPickupDate() {
		return pickupDate;
	}
	public void setPickupDate(String pickupDate) {
		this.pickupDate = pickupDate;
	}
	public String getPickupTime() {
		return pickupTime;
	}
	public void setPickupTime(String pickupTime) {
		this.pickupTime = pickupTime;
	}
	public String getDropCity() {
		return dropCity;
	}
	public void setDropCity(String dropCity) {
		this.dropCity = dropCity;
	}
	public String getDropDate() {
		return dropDate;
	}
	public void setDropDate(String dropDate) {
		this.dropDate = dropDate;
	}

	
	
}
