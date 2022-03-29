package com.springCore.lifeCycle.usingXml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSamosa {
    public static void main(String[] args) {
        //we use abstract to enable shutdownhook for calling destroy methode
     AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifeCycleUsingXml.config.xml");
       Samosa samosa = (Samosa) context.getBean("s1");
        System.out.println(samosa);
        context.registerShutdownHook();
    }
}
