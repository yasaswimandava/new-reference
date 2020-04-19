package com.example.demo.dto;
import java.sql.Date;

public class TravelDto {
	private String userName;
	private int userId;
	private String travelFrom;
	private String travelTo;
	private int distance;
	private Date doj;
	private int price;
	public TravelDto() {
		super();
		
	}
	public TravelDto(String userName, int userId, String travelFrom, String travelTo, int distance, Date doj,
			int price) {
		super();
		this.userName = userName;
		this.userId = userId;
		this.travelFrom = travelFrom;
		this.travelTo = travelTo;
		this.distance = distance;
		this.doj = doj;
		this.price = price;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getTravelFrom() {
		return travelFrom;
	}
	public void setTravelFrom(String travelFrom) {
		this.travelFrom = travelFrom;
	}
	public String getTravelTo() {
		return travelTo;
	}
	public void setTravelTo(String travelTo) {
		this.travelTo = travelTo;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
