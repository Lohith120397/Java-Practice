package org.java.practice2.oops;

public class SingleLevelInheritance extends College{

    int collegeId;
    SingleLevelInheritance(String name, String location, int collegeId) {
        super(name, location);
        this.collegeId = collegeId;
    }

    public static void main(String[] args) {
        SingleLevelInheritance sl = new SingleLevelInheritance("Geeks", "bangalore", 20);
        sl.print();
    }
}

class College
{
    String name;
    String location;

    College(String name, String location)
    {
        this.name = name;
        this.location = location;
    }

    void print()
    {
        System.out.println("Name of the college is: " + name + " and location is " + location);
    }
}