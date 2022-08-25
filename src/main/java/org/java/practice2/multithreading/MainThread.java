package org.java.practice2.multithreading;

public class MainThread {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();

        System.out.println("Current Thread: " + thread.getName());

        thread.setName("Geeks");
        System.out.println("After changing the name: " + thread.getName());

        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("After changing the thread priority: " + thread.getPriority());

        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread");
        }

        Thread t2 = new Thread()
        {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("child thread");
                }
            }
        };

        System.out.println("Child thread priority: " + t2.getPriority());

        t2.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Child thread new priority: " + t2.getPriority());

        System.out.println("Child thread name: " + t2.getName());
        System.out.println(t2.getId());
        System.out.println(thread.getId());
        Thread t3 = new Thread()
        {
            @Override
            public void run() {
                for (int i = 0; i < 2; i++) {
                    System.out.println("2nd child thread");
                }
            }
        };

        System.out.println(t3.getState());
        System.out.println(t3.getId());
    }
}
