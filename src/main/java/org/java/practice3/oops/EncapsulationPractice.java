package org.java.practice3.oops;


class Encapsulation
{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class EncapsulationPractice {
    public static void main(String[] args) {
        Encapsulation ep = new Encapsulation();
        ep.setName("Lohith");
        System.out.println(ep.getName());
        ep.setAge(14);
        System.out.println(ep.getAge());
    }
}
