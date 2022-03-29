package com.springCore.autowiring.usingAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Hotel {

    @Autowired
    //qualifier  annotation is used to handle confusion between more trhan one bean
    @Qualifier("hotelType1")
    private HotelType hotelType;

    public Hotel() {
    }

    public Hotel(HotelType hotelType) {
        this.hotelType = hotelType;
    }

    public HotelType getHotelType() {
        return hotelType;
    }

    public void setHotelType(HotelType hotelType) {
        this.hotelType = hotelType;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelType=" + hotelType +
                '}';
    }
}
