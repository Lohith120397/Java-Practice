package org.java.practice.collections;

import java.util.*;

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
        LinkedList<Integer> lnkList = new LinkedList<>();
        Vector<Integer> vec = new Vector<>();
        Stack<String> sta = new Stack<>();

        //ArrayList simple implementation
        for (int i = 0; i < 5; i++) {
            arr.add(i);
            lnkList.add(i);
            vec.add(i+1);
        }
        System.out.println("Array List data");
        System.out.println(arr);
        arr.remove(3);
        System.out.println(arr);

        System.out.println("Linked List data");
        System.out.println(lnkList);
        lnkList.remove(2);
        System.out.println(lnkList);

        System.out.println("");
        System.out.println(vec);
        vec.remove(1);
        System.out.println(vec);

        sta.push("Geeks");
        sta.push("for");
        sta.push("Geeks");
        sta.push("Geeks");
        System.out.println(sta);
        sta.pop();
        System.out.println(sta);
    }
}
