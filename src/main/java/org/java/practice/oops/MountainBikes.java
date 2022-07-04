package org.java.practice.oops;

public class MountainBikes extends Bicycle
{
    int seatHeight;

    public MountainBikes(int seatHeight, int gear, int speed)
    {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public void setSeatHeight(int height)
    {
        this.seatHeight = height;
    }

    @Override
    public String toString() {
        return (super.toString() + " MountainBikes {" +
                "seatHeight=" + seatHeight +
                '}');
    }

    public static void main(String[] args) {
        MountainBikes mtb = new MountainBikes(13, 4, 30);
        System.out.println(mtb.toString());
    }
}

class Bicycle
{
    int gear;
    int speed;

    public Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int decrement)
    {
        this.speed -= decrement;
    }

    public void speedUp(int increment)
    {
        this.speed += increment;
    }

    @Override
    public String toString() {
        return "Bicycle {" +
                "gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}