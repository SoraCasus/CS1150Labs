package com.cs1150.lab2;

import com.cs1150.util.Point;

public class Circle {
    
    private Point center;
    private double x;
    private double y;
    
    private double radius;
    
    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.center = new Point(x, y);
    }
    
    public Circle() {
        this(0, 0, 1);
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    public double getPerimeter() {
        return Math.PI * radius * 2;
    }
    
    public boolean contains(double x, double y) {
        return this.contains(new Point(x, y));
    }
    
    public boolean contains(Point point) {
        return this.center.distanceTo(point) < this.radius;
    }
    
    public boolean contains(Circle circle) {
        if(circle.getRadius() > this.radius) return false;
        
         return (circle.distanceCentreToCentre(this) < 
                 (this.radius - circle.getRadius()));
    }
    
    public double distanceCentreToCentre(Circle circle) {
        return this.center.distanceTo(circle.getCenter());
    }
    
    public boolean overlapsWith(Circle circle) {
        return this.distanceCentreToCentre(circle) < 
                (this.radius + circle.getRadius());
    }
    
    public Point getCenter() {
        return this.center;
    }
    
    public double getRadius() {
        return this.radius;
    }
    
    public double getX() {
        return this.x;
    }
    
    public double getY() {
        return this.y;
    }
    
    public void setCenter(Point point) {
        this.center = point;
        this.x = center.getX();
        this.y = center.getY();
    }
    
    public void setX(double x) {
        this.x = x;
        this.center.setX(x);
    }
    
    public void setY(double y) {
        this.y = y;
        this.center.setY(y);
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public String toString() {
        return "Circle{X: " + x + ", Y: " + y + ", Radius: " + radius +"}";
    }
        
    
}
