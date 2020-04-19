package com.example.demo.entity;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class TravelBooking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int travelId;
	private String travelFrom;
	private String travelTo;
	private Date doj;
	private int distance;
	private int price;
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private User user;

	public TravelBooking() {
		super();

	}

	public TravelBooking(int travelId, String travelFrom, String travelTo, Date doj, int distance, int price,
			 User user) {
		super();
		this.travelId = travelId;
		this.travelFrom = travelFrom;
		this.travelTo = travelTo;
		this.doj = doj;
		this.distance = distance;
		this.price = price;
		this.user = user;
	}

	public int getTravelId() {
		return travelId;
	}

	public void setTravelId(int travelId) {
		this.travelId = travelId;
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

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

	
}
