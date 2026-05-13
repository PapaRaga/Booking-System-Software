/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.booking_travel_software;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author User
 */
public class User {
	
	private String fullName;
	private int userID;
        private static int count = 1;
	private String password;
        private HashMap<Booking, ArrayList<Purchase>> bookings;
	
	public User(String fullName, String password){
		
		this.fullName = fullName;
		this.userID = count++;
		this.password = password;
                bookings = new HashMap<>();
	}
        
        public User(String fullName, int userID, String password){
		
		this.fullName = fullName;
		this.userID = userID;
		this.password = password;
                bookings = new HashMap<>();
	}
	
	public boolean validateUser(String fullName, String password){
		
		boolean validUser = false;
		
		if(fullName.equals(this.fullName) && password.equals(this.password)){
			
			validUser = true;
			
		}
		
		return validUser;
		
	}
        
        public double overallCalc(double booking, double purchase, double ticketPrice){
            
            double overallCalc = booking + purchase + ticketPrice;
            return overallCalc;
            
        }
        
        public void addBooking(Booking booking,ArrayList<Purchase> purchases){
            bookings.put(booking,purchases);
        }
        public void removeBooking(Booking booking,ArrayList<Purchase> purchases){
            bookings.remove(booking,purchases);
        }
        public static void printBookings(ArrayList<Booking> bookings){
            for(Booking booking: bookings){
                System.out.println(booking.toString());
            }
        }
        
        public int getUserID(){return userID;}
	public void setUserID(int userID){this.userID = userID;}
	public String getName(){return fullName;}
	public void setUserFullName(String fullName){this.fullName = fullName;}
	public String getPassword(){return password;}
	public void setUserPassword(String password){this.password = password;}
        public HashMap<Booking,ArrayList<Purchase>> getBookings(){return bookings;}
        public void setTicketClass(TicketClass ticketType,Booking booking){booking.setTicketClass(ticketType);}
        public void setSeatType(SeatType seatType,Booking booking){booking.setSeatType(seatType);}
        public void setTripType(TripType tripType,Booking booking){booking.setTripType(tripType);}
	
        @Override
        public String toString(){
            
            return "Full name: " + fullName + ", userID: " + userID + ", Password: " + password;
            
        }
	
}
