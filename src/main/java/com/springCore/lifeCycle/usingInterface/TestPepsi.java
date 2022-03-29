package com.springCore.lifeCycle.usingInterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPepsi {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifeCycleUsingInterface.config.xml");

        Pepsi pepsi = (Pepsi) context.getBean("p1");
        System.out.println(pepsi);
        context.registerShutdownHook();
    }
}
