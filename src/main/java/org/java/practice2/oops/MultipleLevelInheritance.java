package org.java.practice2.oops;

public class MultipleLevelInheritance {
    public static void main(String[] args) {
        Male suresh = new Male("Suresh", 25);
        Female sodi = new Female("Sodi", 23);
        suresh.printType();
        System.out.println();
        sodi.printType();
    }
}

//Class for Female
class Female extends Human
{
    String name;
    int age;
    Female(String name, int age) {
        super("Female");
        this.name = name;
        this.age = age;
    }

    @Override
    void printType() {
        System.out.println("Name: " + this.name + "\nAge: " + this.age + "\nGender: " + super.gender + "\nType: " + super.creatureType);
    }
}

//Class for Male
class Male extends Human
{
    String name;
    int age;
    Male(String name, int age) {
        super("Male");
        this.name = name;
        this.age = age;
    }
    @Override
    void printType() {
        System.out.println("Name: " + this.name + "\nAge: " + this.age + "\nGender: " + super.gender + "\nType: " + super.creatureType);
    }
}

class Human extends Creature
{
    String gender;
    Human(String gender)
    {
        super("Human");
        this.gender = gender;
    }
}

class Creature{
    String creatureType;

    Creature(String type)
    {
        this.creatureType = type;
    }

    void printType()
    {}
}
