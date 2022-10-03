package org.java.practice3.oops;


class ExampleException extends Exception
{
    public ExampleException(String message) {
        super(message);
    }
}

public class ExceptionPractice {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            System.out.println(a/b);
        }
        catch (ArithmeticException aex)
        {
            System.out.println(aex.getMessage());
        }
        try {
            throw new ExampleException("Example Exception");
        } catch (ExampleException e) {
            e.printStackTrace();
        }
        System.out.println("final ip");
    }
}
