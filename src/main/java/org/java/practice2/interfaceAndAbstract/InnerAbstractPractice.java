package org.java.practice2.interfaceAndAbstract;


abstract class A {

    abstract void printClassA();

    abstract class B
    {
        abstract void printClassA();
    }

}

class C extends A
{

    @Override
    void printClassA() {
        System.out.println("method 1");
    }

    class D extends B
    {

        @Override
        void printClassA() {
            System.out.println("method 2");
        }
    }
}

interface abc{
    void printAbc();
}

abstract class K implements abc{
    @Override
    public void printAbc() {
        System.out.println("Abc");
    }
}

public class InnerAbstractPractice {
    public static void main(String[] args) {
        C c = new C();

        C.D d = c.new D();

        c.printClassA();
        d.printClassA();
    }

}
