package org.java.practice2.multithreading;

public class ThreadPriorityMain {
    static class MyRunnable implements Runnable
    {
        @Override
        public void run() {
            System.out.println("Count Down begins");
            for (int i = 10; i >= 0; i--) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
        System.out.println("Happy new year!!!!");
    }
}
