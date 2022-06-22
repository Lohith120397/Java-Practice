package org.java.practice.oops;

public class FirstClass {
    private int a; //State or attribute's
    private int b; //State or attribute's

    public FirstClass(){} //How default constructor looks like, if we haven't created one.

    //Parameterized constructor
    public FirstClass(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    //Method or behavior of a class
    void print()
    {
        System.out.println("New class is created\nValue of A: " + a + "\nValue of B: " + b);
    }

    //main method to run a program.
    public static void main(String[] args){
        FirstClass f = new FirstClass(40, 20); //creating a obj using new key word with parameterized constructor.
        f.print(); //calling print method

        FirstClass f1 = new FirstClass(); //creating one more obj with default constructor.
        f1.print();//calling print method which will basically prints 0 for both a and b attributes of FirstClass class.
    }
}
