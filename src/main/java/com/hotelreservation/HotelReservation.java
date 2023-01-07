package com.hotelreservation;

import java.util.ArrayList;

public class HotelReservation {
    public void addHotelDetails() {
        ArrayList<Hotel> hotelList=new ArrayList<>();

            hotelList.add(new Hotel("Lakewood", 110));
            hotelList.add(new Hotel("Bridgewood", 150));
            hotelList.add(new Hotel("Ridgewood", 220));
        }

    }

