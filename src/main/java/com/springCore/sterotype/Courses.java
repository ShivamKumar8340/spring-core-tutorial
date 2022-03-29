package com.springCore.sterotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//we use component annotation to create object without define any bean
@Component("obj")
//scope annotation used to define bean scope
@Scope("prototype")
public class Courses {

    @Value("java")
    private String name;

    @Value("10000")
    private int fees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "name='" + name + '\'' +
                ", fees=" + fees +
                '}';
    }
}
