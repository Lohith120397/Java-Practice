package org.java.practice.oops;


abstract class Shape {
    String color;
    public Shape(String color){
        System.out.println("Inside Shape constructor.");
        this.color = color;
    }

    public void greet()
    {
        System.out.println("Hello everyone!");
    }

     abstract double area();
    /**
     * @return String
     */
    public abstract String toString();
}

abstract class ShapeExtended extends Shape
{
    public ShapeExtended(String color) {
        super(color);
        System.out.println("Inside ShapeExtended constructor.");
    }

    abstract String sayHello();
}

class Square extends ShapeExtended
{
    double a;
    public Square(String color, double a)
    {
        super(color);
        System.out.println("Inside Square Constructor.");
        this.a = a;
    }

    @Override
    double area() {
        return Math.pow(a, 2);
    }

    @Override
    String sayHello() {
        return "Hi, we are in Square class.";
    }

    @Override
    public String toString() {
        return  sayHello() + "Square{" +
                "a=" + a +
                '}' + "color = " + color +" area of square: " + area();
    }
}

class Circle extends Shape{
    double radius;
    public Circle(String color, double radius)
    {
        super(color);
        System.out.println("Inside Circle constructor.");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}' + " color = " + color + " and the area is : " + area();
    }
}

class Rectangle extends Shape{
    double length, width;
    public Rectangle(String color, double length, double width)
    {
        super(color);
        System.out.println("Inside Rectangle constructor.");
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}' + "color = " + color + " and the area is : " + area();
    }
}

public class AbstractTest {
    public static void main(String[] args) {
        Circle shape1 = new Circle("green", 4);
        Rectangle shape2 = new Rectangle("red", 3, 4);
        Square shape3 = new Square("blue", 4);

        System.out.println(shape1.toString());
        System.out.println(shape2.toString());
        System.out.println(shape3.toString());
    }
}
