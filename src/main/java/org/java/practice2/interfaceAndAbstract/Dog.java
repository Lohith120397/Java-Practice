package org.java.practice2.interfaceAndAbstract;

public class Dog implements Animal1, Animal2{

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void travel() {
        System.out.println("Travelling");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.travel();
    }
}
