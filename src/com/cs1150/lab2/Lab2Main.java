package com.cs1150.lab2;

import com.cs1150.util.Point;

public class Lab2Main {

    public static void main(String[] args) {
        Circle a = new Circle();
        Circle b = new Circle(2.1, 2.1, 1.0);
        Point c = new Point(2.0, 0.0);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.print("b's x, y, and radius: " + b.getX() + " " + b.getY() + " ");
        System.out.println(b.getRadius());
        System.out.println("Distance between centres of a and b: " + a.distanceCentreToCentre(b));
        System.out.println("Does a contain the point (0.4, 0.4)? " + a.contains(0.4, 0.4));
        System.out.println("The area of a is: " + a.getArea());
        System.out.println("The area of b is: " + b.getArea());
        System.out.println("The perimeter of a is: " + a.getPerimeter());
        System.out.println("The perimeter of b is: " + b.getPerimeter());
        System.out.println("Does a contain b? " + a.contains(b));
        System.out.println("Does b contain a? " + b.contains(a));
        System.out.println("Do a and b overlap? " + a.overlapsWith(b));
        System.out.println("Do b and a overlap? " + b.overlapsWith(a));
        b.setRadius(2.5);
        System.out.println("Does b contain a? " + b.contains(a));
        System.out.println("Do a and b overlap? " + a.overlapsWith(b));
        System.out.println("Do b and a overlap? " + b.overlapsWith(a));
        b.setX(1.0);
        b.setY(1.0);
        a.setRadius(0.1);
        System.out.println("Does b contain a? " + b.contains(a));
        System.out.println("Does a contain the point c? " + a.contains(c));
        System.out.println("Does b contain the point c? " + b.contains(c));
    }

}
