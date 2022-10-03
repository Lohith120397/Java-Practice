package org.java.practice3.oops;

public class Demo {

    protected int calToAdd(int a, int b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        int sum = d.calToAdd(8,2);
        System.out.println(sum);
    }
}
