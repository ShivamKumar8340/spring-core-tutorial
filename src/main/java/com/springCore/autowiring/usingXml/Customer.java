package com.springCore.autowiring.usingXml;

public class Customer {
    private HomeAdrress homeAdrress;

    public Customer() {
    }

    public Customer(HomeAdrress homeAdrress) {
        this.homeAdrress = homeAdrress;
    }

    public HomeAdrress getHomeAdrress() {
        return homeAdrress;
    }

    public void setHomeAdrress(HomeAdrress homeAdrress) {
        this.homeAdrress = homeAdrress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "homeAdrress=" + homeAdrress +
                '}';
    }
}
