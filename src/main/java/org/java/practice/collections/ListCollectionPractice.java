package org.java.practice.collections;

import java.util.*;

//Practice class to try out different collections in Java.
public class ListCollectionPractice {
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

        Collections.addAll(ls1, "str3423", "saradsad1");
        System.out.println(ls1);
        Collections.sort(ls1);
        System.out.println(ls1);
        System.out.println(
                "The index of str3423 is "
                        + Collections.binarySearch(ls1, "str3423"));
        Collections.sort(ls1, Collections.reverseOrder());
        System.out.println(ls1);

        //Generic method example
        genericDisplay("123");
        genericDisplay(12);
        genericDisplay(1.44f);

        Object a = new String();
        a = "1234";
        System.out.println(a);
        System.out.println(a.getClass().getName());

        Object i = 5;
        System.out.println(i.getClass().getName());
        a = i;
        System.out.println(a);

        Test<Integer> it = new Test<>(20);
        Test<String> st = new Test<>("test");

    }

    //Generic method
    static <T> void genericDisplay(T element)
    {
        System.out.println(element.getClass().getName() + " = " + element);
    }
}

class Test<T> {
    // An object of type T is declared
    T obj;
    Test(T obj) { this.obj = obj; } // constructor
    public T getObject() { return this.obj; }
}
