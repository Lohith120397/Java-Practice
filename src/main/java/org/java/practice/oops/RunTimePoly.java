package org.java.practice.oops;

public class RunTimePoly extends Parent1{

    @Override
    void printHi() {
        System.out.println("Hi from Child");
    }

    public static void main(String[] args) {
        Parent1 p = new RunTimePoly();
        p.printHi();
    }
}

class Parent1{
    void printHi()
    {
        System.out.println("Hi from parent.");
    }
}
