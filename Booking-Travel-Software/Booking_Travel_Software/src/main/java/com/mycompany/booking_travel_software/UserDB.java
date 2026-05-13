/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.booking_travel_software;

/**
 *
 * @author User
 */

import java.sql.*;
import java.util.*;
public class UserDB {
    
    private Connection connection;
    
    public UserDB(Connection conn) {
        
        connection=conn;
        
    }
    
    public HashMap<Integer,User> selectAllUsers() {
        
        HashMap<Integer,User> allUsers = new HashMap<>();
        Statement statement = null;
        ResultSet resultSet = null;
        
        try{
            
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM users");
            
            while (resultSet.next()) {
                String userName = resultSet.getString("FullName");
                int userID = resultSet.getInt("UserID");
                String userPassword = resultSet.getString("Password_");
                User user = new User(userName, userID,userPassword);
                allUsers.put(userID, user);
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
        
        return allUsers;
            
    }
    
    public boolean insertUser(User user) {
        
        boolean returnValue = false;

        String SQL_INSERT = "INSERT INTO users(FullName, UserID, Password_) " +
                "VALUES (?, ?, ?)";

        try {
            
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT);

            preparedStatement.setString(1, user.getName());
            preparedStatement.setInt(2, user.getUserID());
            preparedStatement.setString(3, user.getPassword());

            int row = preparedStatement.executeUpdate();

            if (row == 1) {
                
                returnValue = true;
                
            }

        }catch (SQLException e) {
            
            e.printStackTrace();
            
        }

        return returnValue;
    }
    
}
