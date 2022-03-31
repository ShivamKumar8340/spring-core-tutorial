package com.springCore.speL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFirstDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("speL.cfg.xml");
      FirstDemo fd =  context.getBean("firstDemo",FirstDemo.class);
        System.out.println(fd);
    }
}
