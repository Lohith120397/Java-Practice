package org.java.practice2.oops;

public class Polymorphism {

    public static void main(String[] args) {
        Lenovo m1 = new Lenovo();
        m1.brand = "Lenovo";
        m1.price = 60000;
        m1.printDetails();
        m1.printPrice();
        m1.printPrice(m1.brand);
        m1.printDetails(m1.brand, m1.price);



        Laptop unKnown = new Lenovo(); // we have created a reference type as Laptop and object as Lenovo.
        unKnown.brand = "Unknown";
        unKnown.printDetails(); //the overridden method in Lenovo class will still work, because the method signature is present in parent and child class.
    }
}

class Lenovo extends Laptop
{
    int price;

    void printPrice()
    {
        System.out.println("Price is: " + price);
    }

    //method overloading. we are overloading the method with brand parameter, and it is called static or compile time polymorphism.
    void printPrice(String brand)
    {
        System.out.println("Price is: " + price + " and the brand is: " + brand + " This method is overloaded.");
    }

    //Overriding the method of a parent class, Hence it is called Run time polymorphism or dynamic
    @Override
    void printDetails() {
        System.out.println(brand + " Laptop and the Price is: " + price);
    }

    //Again we are overloading this method with brand and price.
    void printDetails(String lBrand, int lPrice)
    {
        System.out.println(lBrand + " Laptop and the Price is: " + lPrice + " This method is overloaded.");
    }

    static void sayHello()
    {
        System.out.println("hi");
    }

}

class Laptop
{
    String brand;

    static void sayHello()
    {
        System.out.println("hello!!");
    }

    void printDetails()
    {
        System.out.println(brand + " Laptop.");
    }
}