package org.java.practice.oops;

public class Cat extends Animal implements AnimalStuff {

    public void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    public void poop() {
        System.out.println("asdasdasdasd");
    }
}
