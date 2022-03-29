package com.springCore.autowiring.usingAnnotation;

public class HotelType {
    private String facility;
    private String charges;

    public HotelType() {
    }

    public HotelType(String facility, String charges) {
        this.facility = facility;
        this.charges = charges;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public String getCharges() {
        return charges;
    }

    public void setCharges(String charges) {
        this.charges = charges;
    }

    @Override
    public String toString() {
        return "HotelType{" +
                "facility='" + facility + '\'' +
                ", charges='" + charges + '\'' +
                '}';
    }
}
