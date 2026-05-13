/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.booking_travel_software;

/**
 *
 * @author User
 */
import java.util.*;
import java.io.*;

public class AirLine {

	private String Name;
	private HashMap<Integer, User> users;
        private HashMap<Integer, Flight> flights;
	
	public AirLine (String Name) {
		this.Name = Name;
		users = new HashMap<>();
                flights = new HashMap<>();
	}
	
	public String getName() {return Name;}
	public HashMap<Integer, User> getUsers(){return users;}
	public void setName(String Name) {this.Name = Name;}
	
	public User findUser (int userID) {
		for(User user:users.values()) {
			if(user.getUserID() == userID) {
				return user;
				// user window me userin qe u be log in
			}
		}
		return null;
		// new user creation function tek new account window
	}
		
	public boolean AddUser(int userID,User user) {
		if(findUser(userID)==null) {
			users.put(userID, user);
			return true;
		}
		else {
			return false;
		}
	}
        
        public void addFlight(Flight flight){
            
            flights.put(flight.getFlightNumber(), flight);
            
        }
        
        public User validateUser(String fullname, String password){
            
            for(User user:users.values()){
                
                if(user.validateUser(fullname,password)){
                    
                    return user;
                    
                }
                
            }
            
            return null;
            
        }
        
        public HashMap<Integer, Flight> filteredFlights(Date departDate){
            
            HashMap<Integer, Flight> filterFlight = new HashMap<>();
            
            for(Flight flight: flights.values()){
                
                if(flight.getDepartureDate().isEqual(departDate)){
                    
                    filterFlight.put(flight.getFlightNumber(), flight);
                    
                }
                
            }
            
            return filterFlight;
            
        }
        
}
