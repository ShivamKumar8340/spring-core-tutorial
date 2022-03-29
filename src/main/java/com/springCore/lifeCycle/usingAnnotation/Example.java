package com.springCore.lifeCycle.usingAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
    private String  subject;

    public Example() {
    }

    @PostConstruct
    public String getSubject() {
        return subject;
    }
    @PreDestroy
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Example{" +
                "subject='" + subject + '\'' +
                '}';
    }
    public  void start() {
        System.out.println("starting methode");
    }
    public void end() {
        System.out.println("ending methode");
    }
}
