package com.springCore.first;

import com.springCore.first.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("student.config.xml");

        //this result is based on setter injection by element
       Student student1 = (Student) context.getBean("student1");
        System.out.println(student1);

        //this result bases on setter injection by attributes
        Student student2 = (Student) context.getBean("student2");
        System.out.println(student2);

    }
}
