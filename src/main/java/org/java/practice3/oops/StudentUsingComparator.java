package org.java.practice3.oops;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Student
{
    int rollNumber;
    String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }
}

class sortByRoll implements Comparator<Student>
{

    @Override
    public int compare(Student s1, Student s2) {
        return s1.rollNumber - s2.rollNumber;
    }
}

class sortByName implements Comparator<Student>
{
    @Override
    public int compare(Student student, Student t1) {
        return student.name.compareTo(t1.name);
    }
}

public class StudentUsingComparator {



    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student(345, "Manoj"));
        arrayList.add(new Student(200, "Abi"));
        arrayList.add(new Student(322, "geek"));
        arrayList.add(new Student(348, "monk"));

        System.out.println("Before sorting: ");
        for (Student s: arrayList ) {
            System.out.println("Roll number: " + s.rollNumber + " Name: " + s.name);
        }

        Collections.sort(arrayList, new sortByRoll());

        System.out.println("After sorting");
        for (Student s: arrayList ) {
            System.out.println("Roll number: " + s.rollNumber + " Name: " + s.name);
        }
    }

}
