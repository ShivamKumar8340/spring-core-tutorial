package com.springCore.speL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FirstDemo {
    //spring expression language (speL) solve value at run time
    //passing primitive data type value
    @Value("#{20+98}")
    private int x;

    @Value("#{10*2}")
    private  int y;

    //passing static methode
    @Value("#{ T(java.lang.Math).sqrt(144) }")
    private int z;

    //passing variable
    @Value("#{ T(java.lang.Math).PI }")
    private double e;

    //passing object
    @Value("#{ new java.lang.String('shivam kashyap') }")
    private String name;

    //pasing boolean value
    //pass value which give value true or false
    @Value("#{8>1}")
    private  boolean isActive;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "FirstDemo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", e=" + e +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
