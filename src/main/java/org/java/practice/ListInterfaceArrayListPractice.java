package org.java.practice;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceArrayListPractice {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        //adding elements into list.
        lst.add(20);
        lst.add(40);
        System.out.println(lst);

        //Updating the list.
        lst.set(1, 20);
        System.out.println(lst);

        //removing the element from list
        lst.remove(1);
        System.out.println(lst);

        lst.remove((Integer) 20);
        System.out.println(lst);
    }
}
