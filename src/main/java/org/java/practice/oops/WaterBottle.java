package org.java.practice.oops;

public class WaterBottle {
    float price;
    float bottleCapacity;
    String color;
    public float storedWater = 0;

    public WaterBottle(float price, float bottleCapacity, String color)
    {
        if((price > 0) || (bottleCapacity > 0))
        {
            this.price = price;
            this.bottleCapacity = bottleCapacity;
        }
        else
        {
            System.out.println("Prize or bottle capacity cannot be zero or less than zero.");
        }
        this.color = color;
    }

    void storeWater(float water)
    {
        if(water > 0)
        {
            if((this.storedWater + water) < this.bottleCapacity )
            {
                this.storedWater += water;
            }
            else
            {
                System.out.println("Water cannot be stored! its exceeding the bottle capacity");
            }
        }
    }

    void consumeWater(float water)
    {
        if((storedWater!=0) && (water < storedWater))
        {
            storedWater -= water;
        }
    }

    void pourAll()
    {
        storedWater = 0;
    }

    public static void main(String[] args) {
        WaterBottle b1 = new WaterBottle(250.34f, 6.5f, "green");
        System.out.println(b1.toString());
        System.out.println(b1.storedWater);
        b1.storeWater(4);
        System.out.println(b1.storedWater);
        b1.storeWater(2);
        System.out.println(b1.storedWater);
        b1.consumeWater(5);
        System.out.println(b1.storedWater);
        b1.pourAll();
        System.out.println(b1.storedWater);
    }
}
