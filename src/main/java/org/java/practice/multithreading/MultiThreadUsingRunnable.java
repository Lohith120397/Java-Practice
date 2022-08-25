package org.java.practice.multithreading;

public class MultiThreadUsingRunnable {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread tr = new Thread(new MultiThreadRunnable());
            tr.start();
        }
    }
}

class MultiThreadRunnable implements Runnable{
    @Override
    public void run() {
        try
        {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running.");
        }
        catch (Exception ex)
        {
            System.out.println("Exception caught: " + ex.getMessage());
        }
    }
}
