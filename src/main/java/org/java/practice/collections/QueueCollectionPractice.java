package org.java.practice.collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

//Test class to test Queue collections
public class QueueCollectionPractice {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(100);
        pq.add(40);
        System.out.println(pq.peek());
        System.out.println(pq.poll());

        System.out.println(pq.peek());
        System.out.println(pq.poll());

        System.out.println(pq.peek());
        System.out.println(pq.poll());

        System.out.println(pq);

        ArrayDeque<Integer> arrDe = new ArrayDeque<>();
        arrDe.add(100);
        arrDe.add(200);
        System.out.println(arrDe);
        arrDe.clear();

        arrDe.addFirst(1000);
        arrDe.addLast(13);
        arrDe.addFirst(32);
        arrDe.addLast(79);
        System.out.println(arrDe);
    }
}
