/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.booking_travel_software;

import java.util.HashMap;

/**
 *
 * @author User
 */
public class Flight {
	
	private int flightNumber;
	private String departureCity;
	private String destinationCity;
	private Date departureDate;
	private Date arrivalDate;
	private String departureTime;
	private String arrivalTime;
	private double ticketPrice;
	
	public Flight(int flightNumber, String departureCity, String destinationCity, Date departureDate, Date arrivalDate, String departureTime, String arrivalTime, double ticketPrice){
		
		this.flightNumber = flightNumber;
		this.departureCity = departureCity;
		this.destinationCity = destinationCity;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.ticketPrice = ticketPrice;
		
	}
        
        @Override
        public String toString() {
            
            return "Flight number: " + flightNumber + ", Departure City: " + departureCity + ", Destination City: " + destinationCity + ", Departure Date: " + departureDate + ", Arrival Date: " + arrivalDate + ", Departure Time: " + departureTime + ", Arrival Time: " + arrivalTime + ", Ticket Price: " + ticketPrice;
            
        }
        	
	public int getFlightNumber() {return flightNumber;}
	public void setFlightNumber(int newFlightNumber){this.flightNumber = newFlightNumber;}
	public String getDepartureCity() {return departureCity;}
	public void setDepartureCity(String newDepartureCity){this.departureCity = newDepartureCity;}
	public String getDestinationCity () {return destinationCity;}
	public void setDestinationCity(String newDestinationCity){this.destinationCity = newDestinationCity;}
	public Date getDepartureDate() {return departureDate;}
	public void setDepartureDate(Date newDepartureDate){this.departureDate = newDepartureDate;}
	public Date getArrivalDate() {return arrivalDate;}
	public void setArrivalDate(Date newArrivalDate){this.arrivalDate = newArrivalDate;}
	public String getDepartureTime() {return departureTime;}
	public void setDepartureTime(String newDepartureTime){this.departureTime = newDepartureTime;}
	public String getArrivalTime() {return arrivalTime;}
	public void setArrivalTime(String newArrivalTime){this.arrivalTime = newArrivalTime;}
	public double getTicketPrice() {return ticketPrice;}
	public void setTicketPrice(int newTicketPrice){this.ticketPrice = newTicketPrice;}
	
	
	
	

}
