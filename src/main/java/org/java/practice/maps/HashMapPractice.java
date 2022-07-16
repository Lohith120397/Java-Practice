package org.java.practice.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(1, "Geeks");
        hm.put(2, "for");
        hm.put(3, "Geeks");

        System.out.println("Value for 1 is: " + hm.get(1));

        for (Map.Entry<Integer, String> e : hm.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }
}
