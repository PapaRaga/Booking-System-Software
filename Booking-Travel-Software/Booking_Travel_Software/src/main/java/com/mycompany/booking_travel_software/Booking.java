/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.booking_travel_software;

/**
 *
 * @author User
 */

enum TicketClass{
    economic,
    premium_economic,
    business,
    first_class
}

enum SeatType{
    Window,
    Aisle,
    Middle,
    Exit_Row,
    Bulk_Head
}

enum TripType{
    One_Way,
    Round_Trip
}

public class Booking {
    
    protected static Flight flight;
    protected TicketClass ticketClass;
    protected SeatType seatType;
    protected TripType tripType;
    
    public Booking(Flight flight, TicketClass ticketClass, SeatType seatType, TripType tripType){
        this.flight = flight;
        this.ticketClass = ticketClass;
        this.seatType = seatType;
        this.tripType = tripType;
    }
    
    public static double calcBooking(TicketClass ticket, SeatType seat, TripType trip){
        
        double calculation = 0.0;
        
        switch(ticket){
            
            case economic:
                calculation += 100.0;
                break;
            case premium_economic:
                calculation += 200.0;
                break;
            case business:
                calculation += 300.0;
                break;
            case first_class:
                calculation += 400.0;
                break;
            default:
                throw new IllegalArgumentException("Invalid ticket class: " + ticket.name()); 
            
        }
        
        switch(seat){
            
            case Window:
                calculation += 20.0;
                break;
            case Aisle:
                calculation += 15.0;
                break;
            case Middle:
                calculation += 10.0;
                break;
            case Exit_Row:
                calculation += 25.0;
                break;
            case Bulk_Head:
                calculation += 30.0;
                break;
            default:
                throw new IllegalArgumentException("Invalid seat type: " + seat.name());
            
        }
        
        switch(trip){
            
            case One_Way:
                calculation *= 1.0;
                break;
            case Round_Trip:
                calculation *= 1.75;
                break;
            default:
                throw new IllegalArgumentException("Invalid trip type: " + trip.name());
        }
        
        return calculation;
        
    }
    
    public static TicketClass getTicketFromInput(int input1){
        
        switch(input1){
            
            case 1:
                return TicketClass.economic;
            case 2:
                return TicketClass.premium_economic;
            case 3:
                return TicketClass.business;
            case 4:
                return TicketClass.first_class;
            default:
                throw new IllegalArgumentException("Invalid ticket number: " + input1);
           
        }
        
    }
    
    public static SeatType getSeatFromInput(int input2){
        
        switch(input2){
            
            case 1:
                return SeatType.Window;
            case 2:
                return SeatType.Aisle;
            case 3:
                return SeatType.Middle;
            case 4:
                return SeatType.Exit_Row;
            case 5:
                return SeatType.Bulk_Head;
            default:
                throw new IllegalArgumentException("Invalid seat number: " + input2);
           
        }
        
    }
    
    public static TripType getTripFromInput(int input3){
        
        switch(input3){
            
            case 1:
                return TripType.One_Way;
            case 2:
                return TripType.Round_Trip;
            default:
                throw new IllegalArgumentException("Invalid seat number: " + input3);
           
        }
        
    }
    
    public void setTicketClass(TicketClass ticketType){this.ticketClass = ticketType;}
    public void setSeatType(SeatType seatType){this.seatType = seatType;}
    public void setTripType(TripType tripType){this.tripType = tripType;}
    
    public static double getTicketPrice(){
        
        return flight.getTicketPrice();
        
    }
    
    @Override
    public String toString(){
        return flight.toString()+" Ticket Class: "+ticketClass+" Seat Type: "+seatType+" Trip Type: "+tripType;
    }
    
}
