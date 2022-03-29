package com.springCore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCourses {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("sterotype.cfg.xml");
       Courses courses = context.getBean("obj",Courses.class);
       Courses courses1 = context.getBean("obj",Courses.class);

        System.out.println(courses);
        System.out.println(courses1);

        //here we find hashcode to understand beanscope
        System.out.println(courses.hashCode());
        System.out.println(courses1.hashCode());
    }
}
