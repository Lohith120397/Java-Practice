package org.java.practice.oops;

@FunctionalInterface
public interface Printable {

    String print(String s);

    default void hello()
    {
        System.out.println("Hello");
    }

    static void hi()
    {
        System.out.println("hi");
    }
}
