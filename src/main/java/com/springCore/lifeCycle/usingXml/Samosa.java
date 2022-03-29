package com.springCore.lifeCycle.usingXml;

public class Samosa {
    private double price;

    public Samosa() {}

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("setting price");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public void init() {
        System.out.println("inside init methode");
    }
    public void destroy() {
        System.out.println("inside destroy methode");
    }
}
