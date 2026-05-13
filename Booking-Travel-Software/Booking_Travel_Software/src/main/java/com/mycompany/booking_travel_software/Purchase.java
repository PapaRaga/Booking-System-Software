/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.booking_travel_software;

/**
 *
 * @author User
 */

enum In_Flight_Services{SNACK, BEVERAGE, MEAL, WIFI, HEADPHONES, MAGAZINE}

public class Purchase {
    
    private In_Flight_Services item;
    private int quantity;
    
    public Purchase(In_Flight_Services item, int quantity){
        
        this.item = item;
        this.quantity = quantity;
        
    }
    
    public double calcPurchases(In_Flight_Services item, int quantity){
        
        double calcPrice = 0.0;
        
        switch(item){
            case SNACK:
                calcPrice =  5.0 * quantity;
                break;
            case BEVERAGE:
                calcPrice = 3.0 * quantity;
                break;
            case MEAL:
                calcPrice = 12.0 * quantity;
                break;
            case WIFI:
                calcPrice = 10.0 * quantity;
                break;
            case HEADPHONES:
                calcPrice = 8.0 * quantity;
                break;
            case MAGAZINE:
                calcPrice = 4.0 * quantity;
                break;
            default:
                throw new IllegalArgumentException("Invalid item: " + item.name());  
            
        }
        
        return calcPrice;
        
    }
    
    public static In_Flight_Services getItemFromInput(int input) {
        switch (input) {
            case 1:
                return In_Flight_Services.SNACK;
            case 2:
                return In_Flight_Services.BEVERAGE;
            case 3:
                return In_Flight_Services.MEAL;
            case 4:
                return In_Flight_Services.WIFI;
            case 5:
                return In_Flight_Services.HEADPHONES;
            case 6:
                return In_Flight_Services.MAGAZINE;
            default:
                throw new IllegalArgumentException("Invalid item number: " + input);
        }
    }
    
    @Override
    public String toString(){
        
        return "Type of item: " + item + ", Quantity: " + quantity;
        
    }
    
    public In_Flight_Services getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    
    
}
