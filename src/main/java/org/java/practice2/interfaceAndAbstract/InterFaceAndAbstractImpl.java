package org.java.practice2.interfaceAndAbstract;

public class InterFaceAndAbstractImpl extends InterFaceAndAbstractPractice {

    InterFacePractice ifp;

    InterFaceAndAbstractImpl()
    {
        System.out.println("Inside child constructor.");
    }

    InterFaceAndAbstractImpl(InterFacePractice ifp)
    {
        this.ifp = ifp;
    }


    @Override
    public void printHi() {
        System.out.println("hi");
    }


    public static void main(String[] args) {
        InterFaceAndAbstractImpl ab = new InterFaceAndAbstractImpl();

        ab.lol();

        InterFacePractice abc = () -> {
            System.out.println("hello Hi");
        };

        System.out.println(ab.b);
        System.out.println(a);
        abc.printHello();

        InterFaceAndAbstractImpl impl = new InterFaceAndAbstractImpl(()->{
            System.out.println("Testing the scenario");
        });

        impl.ifp.printHello();
        impl.printHello();
        impl.wow();
        InterFacePractice.sayChow();
    }
}
