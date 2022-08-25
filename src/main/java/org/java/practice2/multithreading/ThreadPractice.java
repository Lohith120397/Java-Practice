package org.java.practice2.multithreading;

//Mainly there are 2 ways of creating a Thread + 1 more way using anonymous Runnable object or by lambda implementation
//1. extending Thread class
class Runner extends Thread
{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Runner class: " + i);
            }
            Thread.sleep(1000);
            System.out.println("T1 Awake!!!!");
        }catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}

class RunnableInterface implements Runnable
{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Runnerable Interface class: " + i);
            }
            Thread.sleep(1000);
            System.out.println("T2 Awake!!!!");
        }catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}

public class ThreadPractice {
    public static void main(String[] args) throws InterruptedException {

        Runner t1 = new Runner();
        t1.start();
        Thread t2 = new Thread(new RunnableInterface());
        t2.start();

        //3rd way
        Thread t3 = new Thread(() -> {
            try{
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread 3 " + i );
                }
                Thread.sleep(1000);
                System.out.println("T3 Awake!!!!");
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
        });

        t3.start();


/*        for (int i = 0; i <= 10; i++) {
            System.out.println("Running in main: " + i);
        }*/
    }
}
