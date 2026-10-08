/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehinclerentalapp;

/**
 *
 * @author User
 */
public class VehincleRentalApp {
    
    public abstract class Vehicle{
        
        protected String vehicleId;
         protected String Brand;
         protected String Model;
         protected int year;
         protected int reantalDays;
        private final String brand;
        private final String model;
         
         public Vehicle(String Vehicled, String brand,String model,int year){
             this.vehicleId = vehicleId;
             this.brand = brand;
             this.model =model;
             this.year =year;
             this.reantaldays = reantaldays;
           
             
             
             
         }

        public String getBrand() {
            return Brand;
        }

        public String getModel() {
            return Model;
        }

        public int getYear() {
            return year;
        }

        public int getReantalDays(int ReantalDays) {
            return ReantalDays;
        }

      
        }
         public void displayinfo(String vehicleId, String brand, String model, String year){
             System.out.println(" Vehicle ID: "+ vehicleId );
             System.out.println("Brand:"+ brand);
             System.out.println("Model:"+ model);
             System.out.println("Year:"+ year);
             
         }
         public abstract double calculateRentalCost(int days);
         public String getVehicleId(String vehicleId){
             return vehicleId;
         }
    }
    
    

