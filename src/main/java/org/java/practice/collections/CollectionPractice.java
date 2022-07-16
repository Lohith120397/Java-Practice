package org.java.practice.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

//Practice class to try out different collections in Java.
public class CollectionPractice {
    public static void main(String[] args) {
        List<String> ls1 = new ArrayList<>();
        ls1.add("Str1");
        ls1.add("Str2");
        ls1.add("Str1");

        List<String> ls2 = new Vector<>();
        ls2.add("vec1");
        ls2.add("vec2");
        ls2.add("vec1");

        List<String> ls3 = new Stack<>();
        ls3.add("sta1");
        ls3.add("sta2");
        ls3.add("sta1");

        ArrayList<Integer> arr = new ArrayList<>();
        Vector<String> vec = new Vector<>();
        Stack<String> sta = new Stack<>();

        //ArrayList simple implementation
        for (int i = 0; i < 5; i++) {
            arr.add(i);
        }
        System.out.println(arr);
        arr.remove(3);
        System.out.println(arr);

    }
}
