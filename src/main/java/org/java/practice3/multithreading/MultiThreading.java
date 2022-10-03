package org.java.practice3.multithreading;

public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {


        for (int i = 0; i < 5; i++) {
            MultiThreadingThing myThing = new MultiThreadingThing(i);
            myThing.start();
            System.out.println(myThing.isAlive());
            myThing.join();
            System.out.println(myThing.isAlive());
        }
    }
}


class MultiThreadingThing extends Thread{
    int threadNumber;
    MultiThreadingThing(int threadNumber)
    {
        this.threadNumber = threadNumber;
    }
    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println(i + " from thread " + threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

class MultiThreadingThing_2 implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
            System.out.println(Thread.currentThread());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
