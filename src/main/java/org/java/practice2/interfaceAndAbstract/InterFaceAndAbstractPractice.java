package org.java.practice2.interfaceAndAbstract;

public abstract class InterFaceAndAbstractPractice implements InterFacePractice{

    int b = 133;

    public InterFaceAndAbstractPractice()
    {
        System.out.println("Inside Abstract constructor");
    }

    public abstract void printHi();
    @Override
    public void printHello() {
        System.out.println("hello");
    }

    public final void lol()
    {
        System.out.println("Print Lol.");
    }
}


