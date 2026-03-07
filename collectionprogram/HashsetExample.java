package com.collectionprogram;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("SQL");
        set.add("Python");

        System.out.println("Set: " + set);

        System.out.println("Contains Java: " + set.contains("Java"));

        set.remove("SQL");

        System.out.println("After Remove: " + set);

        System.out.println("Size: " + set.size());
     

            

	}

}
