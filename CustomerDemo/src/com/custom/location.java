package com.custom;

public class location {
	
	private int id;
	private String latitude;
	private String lonitude;
	
	
	public int getId() {
		return id;
	}


	public String getLatitude() {
		return latitude;
	}


	public String getLonitude() {
		return lonitude;
	}


	public location(int id, String latitude, String lonitude) {
		super();
		this.id = id;
		this.latitude = latitude;
		this.lonitude = lonitude;
	}

	
	

}
