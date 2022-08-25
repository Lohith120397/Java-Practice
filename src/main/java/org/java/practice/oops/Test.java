package org.java.practice.oops;


import java.io.*;
import java.util.*;

class newA implements Serializable
{
    int i;
    String s;

    public newA(int a, String s)
    {
        i = a;
        this.s = s;
    }
}

public class Test{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*newA a = new newA(4, "geeks");

        FileOutputStream fos = new FileOutputStream("xyz.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);

        FileInputStream fis = new FileInputStream("xyz.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        newA b = (newA)ois.readObject();

        System.out.println(b.i + " " + b.s);

        oos.close();
        ois.close();*/

        Printable p = (s) -> {
            return "Meow" + s;
        };
        printable(p);

        List<String> lst= new ArrayList<String>();
        Map<Integer, String> map = new HashMap<Integer, String>();

        lst.add("abc");
        lst.add("abe");
        lst.add("abf");
        lst.add("abg");



    }



    static void printable(Printable printPara)
    {
        System.out.println(printPara.print("!"));
        printPara.hello();
        Printable.hi();
    }
}
