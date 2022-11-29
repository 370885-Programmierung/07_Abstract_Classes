package com.cc.java;

public class Circle extends Shape{

    private double radius;

    @Override
    public double area() {
     
        return Math.PI * Math.pow(radius, 2);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    
}
