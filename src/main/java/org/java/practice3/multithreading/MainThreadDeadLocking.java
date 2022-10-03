package org.java.practice3.multithreading;

public class MainThreadDeadLocking {
    public static void main(String[] args) {
        try {
            System.out.println("Entering into deadlock state.");

            Thread.currentThread().join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
