/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.booking_travel_software;

import com.mycompany.booking_travel_software.Flight; 
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class AirLineBookingSystem {
	 
	public static void main(String[] args){
            
//            AirLine air1 = new AirLine("knp");

            // TEST DATA FOR USER DB
            AirlineDB air = new AirlineDB();
            Connection conn = air.getConnection();
            UserDB userDB = new UserDB(conn);
            HashMap<Integer,User> users = userDB.selectAllUsers();
            
            User testUser = new User("Broski", "1234");
            User testUser2 = new User("Skibidi", "toilet");
            User testUser3 = new User("ig", "bu");
            userDB.insertUser(testUser);
            userDB.insertUser(testUser2);
            userDB.insertUser(testUser3);
            User testUser6 = new User("Skibidipopo", "toiletkuku");
            userDB.insertUser(testUser6);
            
            System.out.println("\n--------Users from the database.--------");
            users.values().forEach(System.out::println);
            
            // TEST DATA FOR BOOKINGDB
            BookingDB bookingDB = new BookingDB(conn);
            HashMap<Booking, ArrayList<Purchase>> idk = bookingDB.selectAllBookings();
            ArrayList<Purchase> meh = new ArrayList<>();
            
            Purchase purchase = new Purchase(In_Flight_Services.BEVERAGE, 2);
            Purchase purchase1 = new Purchase(In_Flight_Services.HEADPHONES, 2);
            meh.add(purchase);
            meh.add(purchase1);
            
            Flight flight1 = new Flight(101, "New York", "London", new Date(15, 4, 2024), new Date(16, 4, 2024), "10:00 AM", "1:00 PM", 500.0);
            Booking aBooking = new Booking(flight1, TicketClass.business, SeatType.Aisle, TripType.One_Way);
            
            idk.put(aBooking, meh);
            
            bookingDB.insertBooking(aBooking, meh);
            
            System.out.println("\n--------Bookings from the database.--------");
            idk.keySet().forEach(System.out::println);
            idk.values().forEach(System.out::println);
            
            Flight flight11 = new Flight(2002, "Sydney", "Berlin", new Date(16, 4, 2024), new Date(17, 4, 2024), "14:00 PM", "13:00 PM", 750.0);
            Flight flight12 = new Flight(3003, "London", "Paris", new Date(15, 4, 2024), new Date(15, 4, 2024), "11:00 AM", "14:00 PM", 200.0);
            Flight flight13 = new Flight(4004, "Tokyo", "New York", new Date(18, 4, 2024), new Date(18, 4, 2024), "14:00 PM", "1:00 AM", 900.0);
            
//            Scanner scan = new Scanner(System.in);
//            
//            Flight flight1 = new Flight(101, "New York", "London", new Date(15, 4, 2024), new Date(16, 4, 2024), "10:00 AM", "1:00 PM", 200, 500.0);
//            Flight flight2 = new Flight(202, "Paris", "Tokyo", new Date(16, 4, 2024), new Date(17, 4, 2024), "12:00 PM", "4:00 PM", 150, 800.0);
//            Flight flight3 = new Flight(303, "Berlin", "Sydney", new Date(15, 4, 2024), new Date(16, 4, 2024), "9:00 AM", "8:00 PM", 300, 700.0);
//            Flight flight4 = new Flight(404, "Tokyo", "New York", new Date(16, 4, 2024), new Date(17, 4, 2024), "2:00 PM", "11:00 PM", 250, 900.0);
//            Flight flight5 = new Flight(505, "London", "Paris", new Date(15, 4, 2024), new Date(16, 4, 2024), "11:00 AM", "2:00 PM", 180, 600.0);
//            Flight flight6 = new Flight(606, "Sydney", "Berlin", new Date(16, 4, 2024), new Date(17, 4, 2024), "3:00 PM", "12:00 AM", 280, 750.0);
//            Flight flight7 = new Flight(707, "New York", "Berlin", new Date(15, 4, 2024), new Date(16, 4, 2024), "1:00 PM", "4:00 AM", 220, 850.0);
//            Flight flight8 = new Flight(808, "Paris", "New York", new Date(16, 4, 2024), new Date(17, 4, 2024), "4:00 PM", "10:00 PM", 190, 950.0);
//            Flight flight9 = new Flight(909, "Tokyo", "Sydney", new Date(15, 4, 2024), new Date(16, 4, 2024), "10:00 AM", "5:00 PM", 320, 720.0);
//            Flight flight10 = new Flight(1001, "London", "Tokyo", new Date(16, 4, 2024), new Date(17, 4, 2024), "8:00 AM", "11:00 PM", 270, 850.0);
//		
//            air1.addFlight(flight1);
//            air1.addFlight(flight2);
//            air1.addFlight(flight3);
//            air1.addFlight(flight4);
//            air1.addFlight(flight5);
//            air1.addFlight(flight6);
//            air1.addFlight(flight7);
//            air1.addFlight(flight8);
//            air1.addFlight(flight9);
//            air1.addFlight(flight10);  
//           
//            User user1 = new User("Bruno", "12345");
//            
//            System.out.println("1)SNACK ");
//            System.out.println("2)BEVERAGE ");
//            System.out.println("3)MEAL ");
//            System.out.println("4)WIFI ");
//            System.out.println("5)HEADPHONES ");
//            System.out.println("6)MAGAZINE ");
//            System.out.print("Choose an item: ");
//            int getItem = scan.nextInt();
//            
//            In_Flight_Services selectedService = Purchase.getItemFromInput(getItem);
//            
//            System.out.print("Enter the quantity that you want for that item: ");
//            int quantity = scan.nextInt();
//            
//            Purchase purchase = new Purchase(selectedService, quantity);
//            System.out.println(purchase);
//            System.out.println(purchase.calcPurchases(selectedService, quantity) + "$");
//            
//            System.out.println("---------------------------------------------------------------------------------------");
//            
//            System.out.println("1)ECONOMIC ");
//            System.out.println("2)PREMIUM_ECONOMIC ");
//            System.out.println("3)BUSINESS ");
//            System.out.println("4)FIRST_CLASS ");
//            System.out.print("Choose a ticket class: ");
//            int getTicket = scan.nextInt();
//            
//            TicketClass ticketType = Booking.getTicketFromInput(getTicket);
//            
//            System.out.println("\n---------------------------------------------------------------------------------------");
//            
//            System.out.println("1)WINDOW ");
//            System.out.println("2)AISLE ");
//            System.out.println("3)MIDDLE ");
//            System.out.println("4)EXIT_ROW ");
//            System.out.println("5)BULK_HEAD ");
//            System.out.print("Choose a seat type: ");
//            int getSeat = scan.nextInt();
//            
//            SeatType seatType = Booking.getSeatFromInput(getSeat);
//            
//            System.out.println("\n---------------------------------------------------------------------------------------");
//            
//            System.out.println("1)ONE_WAY ");
//            System.out.println("2)ROUND_TRIP ");
//            System.out.print("Choose a trip type: ");
//            int getTrip = scan.nextInt();
//            
//            TripType tripType = Booking.getTripFromInput(getTrip);
//            
//            System.out.print(Booking.calcBooking(ticketType, seatType, tripType)+ "$");
//            
//            System.out.print("\nChoose a flight: ");
//            int flightType = scan.nextInt();
//            Flight recordetFlight = getTicketPrice(flightType);
//            
//            
//            double calc = user1.overallCalc(Booking.calcBooking(ticketType, seatType, tripType), purchase.calcPurchases(selectedService, quantity), recordetFlight.getTicketPrice());
//            System.out.println("\n" + calc+"$");
            
            
            
            
            
            
            
            
            
//            System.out.print("Enter the departure date in this format(DD/MM/YY): ");
//            String date = scan.nextLine();
//            
//            String[] dateCompressed = date.split("/");
//            int day = Integer.parseInt(dateCompressed[0]);
//            int month = Integer.parseInt(dateCompressed[1]);
//            int year = Integer.parseInt(dateCompressed[2]);
//            
//            Date checkDate = new Date(day, month, year);
//            
//            HashMap<Integer, Flight> retrievedFlights = air1.filteredFlights(checkDate);
//            
//            for(Flight flights: retrievedFlights.values()){
//                
//                System.out.println(flights);
//                
//                
//            }
            
            
//		User user1 = new User("Babi Fabit", "xnxx");
		
//		user1.validateUser("Parthi", "LeshAntena");
		
//		Login_SignIn idk = new Login_SignIn();
//		idk.setVisible(true);
		
//		System.out.println(user1.validateUser("Parthi", "LeshAntena"));		
	}
        
        public static Flight getTicketPrice(int input5){
            
            Flight flight;
            
            switch(input5){
                
                case 1:
                    
                    return flight = new Flight(101, "New York", "London", new Date(15, 4, 2024), new Date(16, 4, 2024), "10:00 AM", "1:00 PM", 500.0);
                    
                case 2:
                    return flight = new Flight(202, "Paris", "Tokyo", new Date(16, 4, 2024), new Date(17, 4, 2024), "12:00 PM", "4:00 PM", 800.0);
                    
                case 3:
                    return flight= new Flight(303, "Berlin", "Sydney", new Date(15, 4, 2024), new Date(16, 4, 2024), "9:00 AM", "8:00 PM", 700.0);
                    
                case 4:
                    return flight = new Flight(404, "Tokyo", "New York", new Date(16, 4, 2024), new Date(17, 4, 2024), "2:00 PM", "11:00 PM", 900.0);
                    
                case 5:
                    return flight = new Flight(505, "London", "Paris", new Date(15, 4, 2024), new Date(16, 4, 2024), "11:00 AM", "2:00 PM", 600.0);
                    
                case 6:
                    return flight = new Flight(606, "Sydney", "Berlin", new Date(16, 4, 2024), new Date(17, 4, 2024), "3:00 PM", "12:00 AM", 750.0);
                    
                case 7:
                    return flight = new Flight(808, "Paris", "New York", new Date(16, 4, 2024), new Date(17, 4, 2024), "4:00 PM", "10:00 PM", 950.0);
                    
                case 8:
                    return flight = new Flight(808, "Paris", "New York", new Date(16, 4, 2024), new Date(17, 4, 2024), "4:00 PM", "10:00 PM", 950.0);
                    
                case 9:
                    return flight = new Flight(909, "Tokyo", "Sydney", new Date(15, 4, 2024), new Date(16, 4, 2024), "10:00 AM", "5:00 PM", 720.0);
                    
                case 10:
                    return flight =  new Flight(1001, "London", "Tokyo", new Date(16, 4, 2024), new Date(17, 4, 2024), "8:00 AM", "11:00 PM", 850.0);
                    
                default:
                    throw new IllegalArgumentException("Invalid flight number: " + input5);
            }
            
        }
	
	
	
	
}
