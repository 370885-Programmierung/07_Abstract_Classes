package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Circle circle = new Circle(1);
        Rectangle rectangle = new Rectangle(2, 2);
        Triangle triangle = new Triangle(2, 1);
     
        output(String.valueOf(circle.area()));
        output(String.valueOf(rectangle.area()));
        output(String.valueOf(triangle.area()));

        output("Diff r-t " + areaDiff(rectangle, triangle));
        output("Diff r-c " + areaDiff(rectangle, circle));
    }
    // Überladung
        // private static double areaDiff(Rectangle r, Triangle t) {
        //     return r.area()-t.area();
        // }

        // private static double areaDiff(Rectangle r, Circle c) {
        //     return r.area()-c.area();
        // }

   //polymorphe Lösung
    private static double areaDiff(Shape s1, Shape s2){
        return s1.area()-s2.area();
    }

    public static void output(String outputStr) {
        System.out.println("Shape hat eine Fläche von: " + outputStr);
    }



}

