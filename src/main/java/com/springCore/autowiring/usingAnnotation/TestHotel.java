package com.springCore.autowiring.usingAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHotel {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireUsingAnnotation.cfg.xml");
         Hotel hotel =context.getBean("hotel",Hotel.class);
        System.out.println(hotel);

    }
}
