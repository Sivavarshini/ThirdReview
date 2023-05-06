package com.Athletics.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class AthleticsParentModel {
	@Id
     private int id;
     private String name;
     private String email;
     @OneToOne(cascade=CascadeType.ALL)
     @JoinColumn(name="address_id")
     private AthleticsChildModel address;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public AthleticsChildModel getAddress() {
		return address;
	}
	public void setAddress(AthleticsChildModel address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "AthleticsParentModel [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + "]";
	}
	
}
