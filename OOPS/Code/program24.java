// Create a class showing the area of circle and rectangle by method overloading.
// Created by Aryan , Rollno 7070
// Note : In order to compile and run this program , rename it from "7070OOP24.java" to "OOP24.java"



// Shape class (parent class)
class Shape {
    // Method to calculate the area of a circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a rectangle
    public double calculateArea(double length, double width) {
        return length * width;
    }
}

public class OOP24 {
    public static void main(String[] args) {
        // Create an instance of the Shape class
        Shape shape = new Shape();

        // Calculate and display the area of a circle
        double circleArea = shape.calculateArea(5.0);
        System.out.println("Area of Circle: " + circleArea);

        // Calculate and display the area of a rectangle
        double rectangleArea = shape.calculateArea(4.0, 6.0);
        System.out.println("Area of Rectangle: " + rectangleArea);
    }
}
