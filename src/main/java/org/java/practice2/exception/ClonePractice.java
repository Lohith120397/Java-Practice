package org.java.practice2.exception;

public class ClonePractice implements Cloneable{
    int a;
    String name;

    ClonePractice(int a, String name)
    {
        this.a = a;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ClonePractice c = new ClonePractice(3, "Clone");
        System.out.println(c.a);
        System.out.println(c.name);

        ClonePractice c1 = (ClonePractice)c.clone();
        System.out.println(c1.a);
        System.out.println(c1.name);
    }
}
