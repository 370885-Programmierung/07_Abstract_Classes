package com.cc.java;

public class Rectangle  extends Shape {

    private double height, width;

    @Override
    public double area() {
      
        return height * width;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    
}
