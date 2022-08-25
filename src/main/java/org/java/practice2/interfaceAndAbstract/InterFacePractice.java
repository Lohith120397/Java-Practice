package org.java.practice2.interfaceAndAbstract;

public interface InterFacePractice {

    int a = 10;
    String name = "name";
    public void printHello();

    public static void sayChow()
    {
        System.out.println("sadasdasd");
    }

    default void wow()
    {
        System.out.println("Say wow!!!!");
    }
}
