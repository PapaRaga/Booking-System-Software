# Airline Booking System

A Java-based Airline Booking Management System developed using Object-Oriented Programming principles and database integration.  
This project simulates a real-world airline reservation platform where users can book flights, select ticket types, choose seats, purchase in-flight services, and manage bookings through a structured system.

---

## Features

### User Management
- User registration and login system
- Store users in a database
- Retrieve all registered users
- User authentication validation

### Flight Management
- Create and manage flights
- Search and filter flights
- View available flight details
- Calculate ticket pricing

### Booking System
- Create airline bookings
- Choose:
  - Ticket Class
  - Seat Type
  - Trip Type
- Calculate booking costs
- Store booking information in a database

### In-Flight Services
Users can purchase additional services such as:
- Snacks
- Beverages
- Meals
- WiFi
- Headphones
- Magazines

### Database Integration
- JDBC database connectivity
- Store and retrieve:
  - Users
  - Bookings
  - Purchases
- SQL-based persistence layer

---

## Technologies Used

- Java
- JDBC
- SQL Database
- Object-Oriented Programming (OOP)
- Java Collections Framework
- Swing (partially implemented GUI)
- Exception Handling

---

## Object-Oriented Concepts Used

- Encapsulation
- Inheritance
- Polymorphism
- Abstraction
- Enums
- Composition
- Collections (`HashMap`, `ArrayList`)
- Database Abstraction Layers

---

## Project Structure

```bash
src/
│
├── AirLineBookingSystem.java
├── AirlineDB.java
├── UserDB.java
├── BookingDB.java
├── User.java
├── Flight.java
├── Booking.java
├── Purchase.java
├── Date.java
├── TicketClass.java
├── SeatType.java
├── TripType.java
├── In_Flight_Services.java
└── Login_SignIn.java
