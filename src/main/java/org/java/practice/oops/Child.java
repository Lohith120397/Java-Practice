package org.java.practice.oops;

public class Child extends Parent {
    public Child(){
        System.out.println("inside child constructor");
    }

    @Override
    void sayHi() {
        super.sayHi();
    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.sayHi();
    }
}
class Parent{
    public Parent()
    {
        System.out.println("inside parent constructor.");
    }

    void sayHi()
    {
        System.out.println("Hi from parent class.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
