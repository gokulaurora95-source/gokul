package com.collectionprogram;


import java.util.TreeSet;

public class TreesetExample {

	public static void main(String[] args) {
	    TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println("Set: " + set);

        System.out.println("First: " + set.first());

        System.out.println("Last: " + set.last());

        System.out.println("Higher than 20: " + set.higher(20));

        System.out.println("Lower than 30: " + set.lower(30));

        for(Integer i : set) {
            System.out.println(i);

	}
	}

}
