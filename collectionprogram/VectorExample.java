package com.collectionprogram;


import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

    Vector<Integer> v = new Vector<>();

    
    v.add(10);
    v.add(20);
    v.add(30);

  
    System.out.println("Vector elements: " + v);
    
    Vector<String> v1 = new Vector<>();

    v1.add("Apple");
    v1.add("Mango");
    v1.add("Orange");

   
    System.out.println(v1.get(1));

    
    v1.set(1, "Banana");

   
    v1.remove("Apple");

    System.out.println(v1);

}
}
