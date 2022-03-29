package com.springCore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {
    public static void main(String[] args) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("emp.config.xml");
       Emp emp = (Emp) context.getBean("emp1");
        System.out.println(emp);

    }
}
