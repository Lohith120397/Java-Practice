package org.java.practice3.multithreading;

class Sender
{
    public void sendMsg(String msg)
    {
        System.out.println("Sending\t" +msg);
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("\n" + msg + " Sent");
    }
}

class ThreadedSend extends Thread
{
    private String msg;
    Sender sender;
    ThreadedSend(String msg, Sender sender)
    {
        this.msg = msg;
        this.sender = sender;
    }

    @Override
    public void run() {
        synchronized (sender)
        {
            sender.sendMsg(msg);
        }
//        sender.sendMsg(msg);
    }
}

public class SynchroThread {
    public static void main(String[] args) {
        ThreadedSend t1, t2;
        Sender send = new Sender();
        t1 = new ThreadedSend("Hi", send);
        t2 = new ThreadedSend("bye", send);

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
