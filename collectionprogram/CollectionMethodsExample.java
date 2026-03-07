package com.collectionprogram;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionMethodsExample {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

        list.add(40);
        list.add(10);
        list.add(30);
        list.add(20);

        Collections.sort(list);
        Collections.shuffle(list);
        Collections.swap(list, 1, 1);
        Collections.reverse(list);
        Collections.max(list);
        Collections.min(list);
        Collections.binarySearch(list,20);
        Collections.fill(list, 100);
        System.out.println("Fill List: " + list);

        Collections.rotate(list, 2);
        System.out.println("Rotate List: " + list);

        System.out.println("Singleton: " + Collections.singleton("Java"));

        System.out.println("nCopies: " + Collections.nCopies(5, "Java"));
        System.out.println(list);
       
        
        

	}

}
