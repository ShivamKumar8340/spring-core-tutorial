package com.springCore.lifeCycle.usingAnnotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestExample {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifeCycleUsingAnnotation.config.xml");
        Example example = (Example) context.getBean("e1");
        System.out.println(example);
    }
}
