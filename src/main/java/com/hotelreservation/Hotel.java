package com.hotelreservation;
public class Hotel {
    // Parameters
 private String hotelName;
 private int regularRate;
  public Hotel(String hotelName, int regularRate) {//Parameterized Constructor
     this.hotelName = hotelName;
     this.regularRate = regularRate;
    }
 public String getHotelName() // Getter And Setter Methods
 {
   return hotelName;
  }
  public void setHotelName(String hotelName)
  {
      this.hotelName = hotelName;
   }
 public int getRegularRate()
 {
      return regularRate;
  }public void setRegularRate(int regularRate)
 {
     this.regularRate = regularRate;
  }
}


