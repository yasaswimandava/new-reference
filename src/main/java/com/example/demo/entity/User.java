package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userName;
	private int age;
	@OneToMany(cascade = CascadeType.PERSIST, mappedBy = "user")
	@JsonIgnoreProperties
	private List<TravelBooking> travellist;
	public User() {
		super();
	
	}
	public User(int userId, String userName, int age, List<TravelBooking> travellist) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.age = age;
		this.travellist = travellist;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<TravelBooking> getTravellist() {
		return travellist;
	}
	public void setTravellist(List<TravelBooking> travellist) {
		this.travellist = travellist;
	}
	
	

	
}
