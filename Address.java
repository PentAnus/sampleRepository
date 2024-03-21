package com.basic;

public class Address {
	private int drno;
	private String street;
	private String city;
	private int pincode;
	public int getDrno() {
		return drno;
	}
	public void setDrno(int drno) {
		this.drno = drno;
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
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int drno, String street, String city, int pincode) {
		super();
		this.drno = drno;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}

	

}
