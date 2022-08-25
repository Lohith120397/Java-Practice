package org.java.practice.oops;

public interface IT1 {

    int a = 6;

    static void sayHi()
    {
        System.out.println("Hi!");
    }

    default void sayHello()
    {
        System.out.println("hello");
    }

    public void sayHow();
}
