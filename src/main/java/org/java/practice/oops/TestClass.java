package org.java.practice.oops;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestClass implements IT1{
    public static void main(String[] args) {

        TestClass t = new TestClass();
        IT1.sayHi();
        t.sayHello();
        t.sayHow();
        System.out.println(IT1.a);
        t.too();
        System.out.println(t.toString());


        /*Cat sweetie = new Cat();
        sweetie.makeNoise();
        sweetie.poop();*/

        /*ArrayList<Student> students = new ArrayList<>();
        students.add( new Student(43, "Lohith Kumar", "bangalore"));
        students.add( new Student(29, "Kishan Kumar", "bangalore"));
        students.add( new Student(64, "Suresh Kumar", "bangalore"));
        students.add( new Student(02, "Mahesh Kumar", "bangalore"));

        System.out.println("Before sorting.");

        for (Student s: students ) {
            System.out.println(s.toString());
        }

        Collections.sort(students, new SortByRoll());

        System.out.println("After sorting with roll number");

        for (Student s: students) {
            System.out.println(s.toString());
        }

        Collections.sort(students, new SortByName());

        System.out.println("after sorting with names");
        for (Student s: students) {
            System.out.println(s.toString());
        }*/
    }

    @Override
    public void sayHow() {
        System.out.println("How are you?");
    }

    public void too()
    {
        System.out.println("toooooo.");
    }

    @Override
    public String toString() {
        return "too";
    }
}
