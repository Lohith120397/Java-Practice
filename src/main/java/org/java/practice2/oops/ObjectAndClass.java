package org.java.practice2.oops;

public class ObjectAndClass{
    int num;
    int num2;

    ObjectAndClass(int num, int num2)
    {
        this.num = num;
        this.num2 = num2;
    }

    static void print(ObjectAndClass obj)
    {
        System.out.println("The value of num1 is: " + obj.num + " and value of num2 is: " + obj.num2);
        obj.num = 1;
        obj.num2 = 2;
        System.out.println("After changing the values: " + obj.num + " " + obj.num2);
    }

    static void priValue(int a)
    {
        System.out.println("a Value is: " + a);
        a = 97;
        System.out.println("after changing the value: " + a);
    }

    //Main method to run a program
    public static void main(String[] args) {
        ObjectAndClass obj; //Declaring the variable
        obj = new ObjectAndClass(20, 40); //Initializing the class
        obj.print(obj);

        int num = 56;
        ObjectAndClass.priValue(num);
        System.out.println(num);
    }

}
