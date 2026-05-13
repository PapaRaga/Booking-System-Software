/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.booking_travel_software;

/**
 *
 * @author User
 */
public class Date {
 
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year){
  
		this.day = day;
		this.month = month;
		this.year = year;
  
 	}

        public boolean isEqual(Date otherDate){
            
            return this.day == otherDate.day &&
               this.month == otherDate.month &&
               this.year == otherDate.year;
            
        }
        
        @Override
        public String toString(){
            
            return day + "/" + month + "/" + year;
            
        }
 	
 	public int getDay(){return day;}
	public void setDay(int newDay){this.day = newDay;}
	public int getMonth(){return month;}
	public void setMonth(int newMonth){this.month = newMonth;}
	public int getYear(){return year;}
	public void setYear(int newYear){this.year = newYear;}
	
	
}
