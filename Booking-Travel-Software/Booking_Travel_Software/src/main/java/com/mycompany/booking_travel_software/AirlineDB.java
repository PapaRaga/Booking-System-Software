/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.booking_travel_software;

/**
 *
 * @author User
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class AirlineDB {
    
    private Connection connection;
    
    public Connection getConnection()
    {
        return connection;
    }
    
    public AirlineDB(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try{
           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/flydreamairline","root","170578");
        }catch(SQLException e){
          e.printStackTrace();
        }
    }
    
    
    
}
