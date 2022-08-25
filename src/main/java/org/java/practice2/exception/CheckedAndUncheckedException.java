package org.java.practice2.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedAndUncheckedException {
    public static void main(String[] args) {

        try
        {
            openFile("abc.txt");
        }catch (FileNotFoundException fnfe)
        {
            System.out.println(fnfe.getMessage());
        }

        //example for unchecked exception
        divideByZero(2,0);
    }

    //checked exception can be declared in 2 ways
    //1. using try-catch block
    //2. using throws -> the caller method should handle it for example main method
    private static void openFile(String fileName) throws FileNotFoundException
    {
        FileReader fileRead = new FileReader(fileName);
    }

    //example for unchecked exception
    //we should declare try-catch block here or in caller method
    private static int divideByZero(int a, int b)
    {
        int res = 0;
        try{
            res = a/b;
        }
        catch (RuntimeException rte)
        {
            System.out.println(rte.getMessage());
        }
        return res;
    }
}
