package org.java.practice2.collections;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>(0);
        Hashtable<Integer, String> h = new Hashtable<>(0);

        v.add("Vector1");
        v.add("Vector2");
        v.add("Vector1");

        h.put(1, "Hash1");
        h.put(2, "Hash2");
        h.put(3, "Hash3");

        for (int i = 0; i < h.size(); i++) {
            System.out.println(v.get(i));
            System.out.println(h.get(i+1));
        }

    }
}
