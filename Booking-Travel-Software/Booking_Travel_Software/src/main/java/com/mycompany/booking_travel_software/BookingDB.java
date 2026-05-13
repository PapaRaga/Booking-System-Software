/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.booking_travel_software;

import java.sql.Connection;

/**
 *
 * @author User
 */

import java.sql.*;
import java.util.*;
public class BookingDB {
    
    private Connection connection;
    
    public BookingDB(Connection conn) {
        
        connection=conn;
        
    }
    
    public HashMap<Booking, ArrayList<Purchase>> selectAllBookings() {
        
        HashMap<Booking, ArrayList<Purchase>> allBookings = new HashMap<>();
        ArrayList<Purchase> purchases = new ArrayList<>();
        Statement statement = null;
        ResultSet resultSet = null;
        
        try{
            
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM booking");
            
            while (resultSet.next()) {
                
                int flightNum = resultSet.getInt("FlightNumber");
                String departureCity = resultSet.getString("DepartureCity");
                String destinationCity = resultSet.getString("DestinationCity");
                int departureDay = resultSet.getInt("DepartureDay");
                int departureMonth = resultSet.getInt("DepartureMonth");
                int departureYear = resultSet.getInt("DepartureYear");
                Date departureDate = new Date(departureDay, departureMonth, departureYear);
                int arrivalDay = resultSet.getInt("ArrivalDay");
                int arrivalMonth = resultSet.getInt("ArrivalMonth");
                int arrivalYear = resultSet.getInt("ArrivalYear");
                Date arrivalDate = new Date(arrivalDay, arrivalMonth, arrivalYear);
                String departureTime = resultSet.getString("DepartureTime");
                String arrivalTime = resultSet.getString("ArrivalTime");
                double ticketPrice = resultSet.getInt("TicketPrice");
                Flight flight = new Flight(flightNum, departureCity, destinationCity, departureDate, arrivalDate, departureTime, arrivalTime, ticketPrice);
                
                String tickclass = resultSet.getString("TicketClass");
                String seatType = resultSet.getString("SeatType");
                String tripType = resultSet.getString("TripType");
                
                Booking booking = new Booking(flight, TicketClass.valueOf(tickclass), SeatType.valueOf(seatType), TripType.valueOf(tripType));
                allBookings.put(booking, purchases);
            }
        
        }catch (SQLException e) {
            
            e.printStackTrace();
            
        }
        
        finally {
            
            if (statement != null) {
                
                try {
                    
                    resultSet.close();
                    statement.close();
                
                }catch (SQLException e) {
                    
                    e.printStackTrace();
                    
                }
            }
        }
        
        return allBookings;
        
    }
    
    public boolean insertBooking(Booking booking, ArrayList<Purchase> purchase) {
        
        boolean returnValue = false;

        String SQL_INSERT = "INSERT INTO booking(FlightNumber, DepartureCity, DestinationCity, DepartureDay, DepartureMonth, DepartureYear, ArrivalDay, ArrivalMonth, ArrivalYear, DepartureTime, ArrivalTime, TicketPrice, TicketClass, SeatType, Triptype, Items, Quantity) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            
            for(Purchase pur: purchase){
                
                PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT);

                preparedStatement.setInt(1, Booking.flight.getFlightNumber());
                preparedStatement.setString(2, Booking.flight.getDepartureCity());
                preparedStatement.setString(3, Booking.flight.getDestinationCity());
                preparedStatement.setInt(4, Booking.flight.getDepartureDate().getDay());
                preparedStatement.setInt(5, Booking.flight.getDepartureDate().getMonth());
                preparedStatement.setInt(6, Booking.flight.getDepartureDate().getYear());
                preparedStatement.setInt(7, Booking.flight.getArrivalDate().getDay());
                preparedStatement.setInt(8, Booking.flight.getArrivalDate().getMonth());
                preparedStatement.setInt(9, Booking.flight.getArrivalDate().getYear());
                preparedStatement.setString(10, Booking.flight.getDepartureTime());
                preparedStatement.setString(11, Booking.flight.getArrivalTime());
                preparedStatement.setDouble(12, Booking.flight.getTicketPrice());
                preparedStatement.setString(13, booking.ticketClass.toString());
                preparedStatement.setString(14, booking.ticketClass.toString());
                preparedStatement.setString(15, booking.ticketClass.toString());
                preparedStatement.setString(16, pur.getItem().toString());
                preparedStatement.setInt(17, pur.getQuantity());

                int row = preparedStatement.executeUpdate();

                if (row == 1) {

                    returnValue = true;

                }
                
            }

        }catch (SQLException e) {
            
            e.printStackTrace();
            
        }

        return returnValue;
    }
    
}
