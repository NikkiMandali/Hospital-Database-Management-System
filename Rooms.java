package net.javaguides.dbms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rooms")
public class Rooms {

	@Id
	@Column(name = "Room_No")
	private long id;
	
	@Column(name = "Room_Type")
	private String type;
	
	@Column(name = "Room_Cost")
	private long cost;
	
	@Column(name = "Availability")
	private String availability;

	public Rooms() {
		super();
	}

	public Rooms(String type, long cost, String availability) {
		super();
		this.type = type;
		this.cost = cost;
		this.availability = availability;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getCost() {
		return cost;
	}

	public void setCost(long cost) {
		this.cost = cost;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}
}
