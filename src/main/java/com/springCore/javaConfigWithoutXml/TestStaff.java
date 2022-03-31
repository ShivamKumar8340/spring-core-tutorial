package com.springCore.javaConfigWithoutXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestStaff {
    public static void main(String[] args) {
        ApplicationContext context =new  AnnotationConfigApplicationContext(StaffConfig.class);

        // we can call any bean name that we have declare in our StaffConfig class
       // Staff staff =context.getBean("staff",Staff.class);
       // Staff staff =context.getBean("temp",Staff.class);
        Staff staff =context.getBean("con",Staff.class);
        System.out.println(staff);
        staff.cleaning();
    }
}
