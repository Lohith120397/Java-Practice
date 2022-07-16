package org.java.practice.collections;

import java.util.*;

public class SetCollectionPractice {
    public static void main(String[] args) {
        HashSet<String> hSet = new HashSet<>();

        hSet.add("hello");
        hSet.add("hi");
        hSet.add("ola");
        hSet.add("hi"); //duplicate will not be added.

        System.out.println(hSet);

        LinkedHashSet<String> lnkHsSet = new LinkedHashSet<>();
        lnkHsSet.add("A1");
        lnkHsSet.add("A2");
        lnkHsSet.add("A3");
        lnkHsSet.add("A1");

        System.out.println(lnkHsSet);

        //SortedSet example
        TreeSet<String> tSet = new TreeSet<>();
        tSet.add("Tset1");
        tSet.add("Abc");
        tSet.add("abc");
        tSet.add("123");
        System.out.println(tSet);
    }
}
