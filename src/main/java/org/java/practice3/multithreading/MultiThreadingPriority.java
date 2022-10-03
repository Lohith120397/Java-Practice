package org.java.practice3.multithreading;

public class MultiThreadingPriority {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        System.out.println("t1 thread priority: " + t1.getPriority());

        t1.setPriority(2);
        System.out.println("t1 thread priority: " + t1.getPriority());
    }
}


class ThreadDemo extends Thread
{
    @Override
    public void run() {
        System.out.println("Inside run method");
    }
}