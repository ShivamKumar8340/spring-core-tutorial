package com.springCore.autowiring.usingXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext  context =new ClassPathXmlApplicationContext("autowireusingXml.config.xml");
      Customer  customer =  context.getBean("customer",Customer.class);
        System.out.println(customer);
    }
}
