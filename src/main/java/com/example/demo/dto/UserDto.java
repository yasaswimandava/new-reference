package com.example.demo.dto;

import com.example.demo.entity.User;

public class UserDto {
	private User user;
	private String travelFrom;
	public UserDto() {
		super();
		
	}
	public UserDto(User user, String travelFrom) {
		super();
		this.user = user;
		this.travelFrom = travelFrom;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getTravelFrom() {
		return travelFrom;
	}
	public void setTravelFrom(String travelFrom) {
		this.travelFrom = travelFrom;
	}
	

}
