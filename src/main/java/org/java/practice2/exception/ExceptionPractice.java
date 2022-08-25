package org.java.practice2.exception;

public class ExceptionPractice {

    static int division(int a, int b)
    {
        int res = 0;
        try {
            res = a/b;
        }
        catch (NullPointerException npe)
        {
            npe.printStackTrace();
        }
        return res;
    }

    static int computeDivision(int a, int b)
    {
        int res = 0;
        try
        {
            res = ExceptionPractice.division(a, b);
        }
        catch (NullPointerException nfe)
        {
            nfe.printStackTrace();
        }
        return res;
    }


    public static void main(String[] args) {
        try
        {
            ExceptionPractice.computeDivision(4, 0);
        }
        catch (ArithmeticException ex)
        {
            System.out.println(ex.getMessage());
        }
        System.out.println("End here.");


        try
        {
            //Throwing user defined exceptions
            throw new UserBuiltException("new exception");
        }
        catch (UserBuiltException ube)
        {
            ube.printStackTrace();
        }

    }

}

//creating user defined or custom exception.
class UserBuiltException extends Exception
{
    public UserBuiltException() {
        super();
    }

    public UserBuiltException(String s) {
        super(s);
    }
}
