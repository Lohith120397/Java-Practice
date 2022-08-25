package org.java.practice.oops;

public class CustomException {
    public static void main(String[] args) {
        try
        {
            throw new MyException("GeeksForGeeks");
        }
        catch (MyException e)
        {
            e.printStackTrace();
            System.out.println("caught.");

            System.out.println(e.getMessage());
        }
        try
        {
            throw new MyException();
        }
        catch (MyException ex)
        {
            ex.printStackTrace();
            System.out.println("2nd caught");
            System.out.println(ex.getMessage());
        }
    }
}

class MyException extends Exception{
    public MyException(){super();}
    public MyException(String s)
    {
        super(s);
    }
}
