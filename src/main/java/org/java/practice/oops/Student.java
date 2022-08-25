package org.java.practice.oops;

import java.util.Comparator;

public class Student {
    int rollNumber;
    String name, address;

    Student(int roll, String name, String address)
    {
        this.rollNumber = roll;
        this.address = address;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}

class SortByRoll implements Comparator<Student>
{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.rollNumber - o2.rollNumber;
    }
}

class SortByName implements Comparator<Student>
{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}
