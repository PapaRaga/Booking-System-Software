/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.booking_travel_software;

/**
 *
 * @author User
 */
public class ContactInfo {
	
	private Address address;
	private String phone;
	private String email;
	
	public ContactInfo(Address address, String phone, String email){
		
		this.address = address;
		this.phone = phone;
		this.email = email;
		
	}
	
	public void contactInfo(){
		
		System.out.println("Address: " + address + "\n" + "Phone number: " + phone + "\n" + "Email: " + email);
		
	}
	
	public Address getAddress(){return address;}
	public void setAddress(Address newAddress){this.address = newAddress;}
	public String getPhone(){return phone;}
	public void setPhone(String newPhoneNumber){this.phone = newPhoneNumber;}
	public String getEmail(){return email;}
	public void setEmail(String newEmail){this.email = newEmail;}
	

}
