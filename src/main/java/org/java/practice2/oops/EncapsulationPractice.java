package org.java.practice2.oops;

//Encapsulation is a way of hiding a data from direct access by other class, where we use setter and getter method to access and set the variable data.
public class EncapsulationPractice {
    public static void main(String[] args) {
        Area rec = new Area(20, 5);
        rec.getArea();

        //changing the variable value directly and result will be different
        rec.length = 5;
        rec.getArea();

        System.out.println();
        Area2 rec2 = new Area2(25, 4);
        rec2.getArea();
        rec2.setBreadth(2); //we can only set the value using methods, not by directly using the instance variable.
        rec2.getArea();

    }
}

//Class without encapsulation
class Area{
    int length, breadth;

    Area(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    void getArea()
    {
        int area = this.length * this.breadth;
        System.out.println("Area: " + area);
    }
}

//Class with data encapsulation
class Area2{
    private int length, breadth;

    Area2(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    //Getter Setter to maintain encapsulation
    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    void getArea()
    {
        int area = this.length * this.breadth;
        System.out.println("Area: " + area);
    }
}