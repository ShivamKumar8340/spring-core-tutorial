package com.springCore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRef {
    public static void main(String[] args) {
        ApplicationContext context = new  ClassPathXmlApplicationContext("ref.config.xml");
        A a = (A) context.getBean("aref");
        System.out.println(a.getX());
        System.out.println(a.getObj().getY());


        System.out.println(a);



    }
}
