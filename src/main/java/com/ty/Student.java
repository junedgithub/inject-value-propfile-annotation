package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value(value = "${my_name}")
    private String name;
    @Value(value = "${my_age}")
    private int age;
    @Value(value = "${my_height}")
    private double height;

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Height :"+height);
    }
}
