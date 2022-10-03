package org.java.practice3.multithreading;

public class ThreadStates extends Thread{
    @Override
    public synchronized void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException{
        ThreadStates ts = new ThreadStates();

    }
}
