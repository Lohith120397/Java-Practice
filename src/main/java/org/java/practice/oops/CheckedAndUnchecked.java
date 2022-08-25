package org.java.practice.oops;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedAndUnchecked {

    public static void main(String[] args) {
        printStrLen(null);
        System.out.println("hello");
    }

    //example for checked exception
    public static void readFile(String fileName) throws FileNotFoundException
    {
        FileReader fr = new FileReader(fileName);
    }

    //example for unchecked exception
    public static void printStrLen(String str) throws NullPointerException
    {
        try {
            System.out.println(str.length());

        }
        catch (NullPointerException npe)
        {
            System.out.println("String cannot be null.");
        }
    }
}
