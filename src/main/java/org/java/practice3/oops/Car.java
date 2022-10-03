package org.java.practice3.oops;

class Vehicle
{
    private String type;
    private String color;
    private String engineCapacity;

    public Vehicle(String type, String color, String engineCapacity) {
        this.type = type;
        this.color = color;
        this.engineCapacity = engineCapacity;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Type of vehicle: " + this.type + "\nColor: " + this.color +"\nEngine Capacity: " + this.engineCapacity;
    }
}


public class Car extends Vehicle{
    public String model;
    public String brand;

    public Car(String type, String color, String engineCapacity, String model, String brand) {
        super(type, color, engineCapacity);
        this.model = model;
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Brand: "+this.brand +"\nmodel: "+ this.model +"\n" + super.toString();
    }

    public static void main(String[] args) {
        Car baleno = new Car("Car", "red", "5000cc", "Baleno", "Suzuki");
        System.out.println(baleno.toString());
    }
}
