package com.collectionprogram;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

       
        q.add(20);
        q.add(30);

        System.out.println("Queue: " + q);

       
        q.poll();

        System.out.println("After poll: " + q);

       
        System.out.println("Front element: " + q.peek());
        
        Deque<Integer> dq = new ArrayDeque<>();

     
        dq.addFirst(10);
        dq.addLast(20);
        dq.addLast(30);

        System.out.println("Deque: " + dq);

     
        dq.removeFirst();
        dq.removeLast();

        System.out.println("After remove: " + dq);

	}

}
