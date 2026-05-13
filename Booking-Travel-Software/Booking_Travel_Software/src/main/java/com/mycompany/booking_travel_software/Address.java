/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.booking_travel_software;

/**
 *
 * @author User
 */
public class Address {
	
	private int postalCode;
    private String street;
    private String state;
    private String city; 
    private String country;
	
	public Address(int postalCode, String street, String state, String city, String country){
		
		this.city = city;
		this.country = country;
		this.postalCode = postalCode;
		this.street = street;
		this.state = state;
		
	}
	
	public int getPostalCode(){return postalCode;}
	public void setPostalCode(int newPostalCode){this.postalCode = newPostalCode;}
	public String getStreet(){return street;}
	public void setStreet(String newStreet){this.street = newStreet;}
	public String getState(){return state;}
	public void setState(String newState){this.state = newState;}
	public String getCity(){return city;}
	public void setCity(String newCity){this.city = newCity;}
	public String getCountry(){return country;}
	public void setCountry(String newCountry){this.country = newCountry;}
	
	

}
