package org.java.practice2.oops;

public class Hierarchical {
    public static void main(String[] args) {
        Dog sweetie = new Dog("Sweetie", 4, "Black and white");
        Cat snow = new Cat("Snow", 2, "White");
        sweetie.printDetails();
        System.out.println();
        snow.printDetails();

    }
}

class Dog extends Animal
{
    String color;
    Dog(String name, int age, String color)
    {
        super(name, age);
        this.color = color;
    }


    @Override
    void printSound() {
        System.out.println("Woff! Woff!");
    }

    @Override
    void printDetails() {
        System.out.println("Name: " + name + "\nAge: " +age + "\nColor: " + color);
        printSound();
    }
}

class Cat extends Animal
{
    String color;
    Cat(String name, int age, String color)
    {
        super(name, age);
        this.color = color;
    }

    @Override
    void printSound() {
        System.out.println("Meow! Meow!");
    }
    @Override
    void printDetails() {
        System.out.println("Name: " + name + "\nAge: " +age + "\nColor: " + color);
        printSound();
    }
}

class Animal
{
    String name;
    int age;

    Animal(String name, int age)
    {
        this.age = age;
        this.name = name;
    }

    void printSound(){}

    void printDetails(){}
}
