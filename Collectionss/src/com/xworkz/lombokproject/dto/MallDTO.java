package com.xworkz.lombokproject.dto;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class MallDTO implements Serializable, Comparable<MallDTO>{


	private static final long serialVersionUID = 1L;
	int id;
	String name;
	Location location;
	String owner;
	int landDimension;
	public MallDTO(int i, String string, Location drrajkumarroad, String string2, int j) {
		// TODO Auto-generated constructor stub
	}
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
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getLandDimension() {
		return landDimension;
	}
	public void setLandDimension(int landDimension) {
		this.landDimension = landDimension;
	}
	@Override
	public String toString() {
		return "Id: " + id + ", Name: " + name + ", Location: " + location + ", Owner: " + owner
				+ ", Land Dimension: " + landDimension +" sq feet";
	}
	public int compareTo1(MallDTO o) {
		return id;

		
	}
	public int compareTo11(MallDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int compareTo(MallDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}	
}