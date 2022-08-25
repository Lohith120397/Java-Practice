package org.java.practice.oops;

public class ExceptionTest {


    static int divideByZero(int a, int b)
    {
        int i = a/b;
        return i;
    }

    static int computeDivision(int a, int b)
    {
        int res = 0;
        try
        {
            res = divideByZero(a, b);
        }
        catch (NumberFormatException e)
        {
            System.out.println("NumberFormatException is occurred");
        }

        return res;
    }

    public static void main(String[] args) throws InterruptedException{
       /* try
        {
            int result = computeDivision(5, 0);
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
        }

        try {
            String a = null;
            System.out.println(a.charAt(0));
        }
        catch (NullPointerException e)
        {
            System.out.println("NullPointer Exception.");
        }*/

        Thread.sleep(1000);
        System.out.println("hello Geeks");
    }
}
