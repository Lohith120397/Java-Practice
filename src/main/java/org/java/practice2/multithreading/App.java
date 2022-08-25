package org.java.practice2.multithreading;

import java.util.Scanner;

class Processor extends Thread
{
    public volatile boolean running = true;
    @Override
    public void run() {
        while(running)
        {
            System.out.println("hello");
            try {
                Thread.sleep(300);
            }
            catch (InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
    }

    public void stopRunning()
    {
        running = false;
    }
}

public class App {
    public static void main(String[] args) {
        Processor p = new Processor();
        p.start();
        Scanner s = new Scanner(System.in);
        s.nextLine();
        p.stopRunning();
        s.close();
    }
}
