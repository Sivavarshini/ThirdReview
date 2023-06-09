package com.Athletics.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class AthleticsChildModel {
	@Id
	   @GeneratedValue
	   private Long id;
	   private String street;
	   private String city;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "AthleticsChildModel [id=" + id + ", street=" + street + ", city=" + city + "]";
	}
}
