package org.java.practice.multithreading;

public class MultiThreadPractice{
    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {
            MultiThread mt = new MultiThread();
            System.out.println(mt.getState());
            mt.start();
            System.out.println(mt.getState());
        }
    }
}


class MultiThread extends Thread
{
    @Override
    public void run() {
        try{
            System.out.println("Thread " + Thread.currentThread().getId() + " is running.");
        }
        catch (Exception ex)
        {
            System.out.println("Exception caught! " + ex.getMessage());
        }
    }
}
