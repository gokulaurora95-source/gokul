package com.collectionprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylistprogram {

	public static void main(String[] args) {
	ArrayList<Integer> list= new ArrayList<Integer>();
	
	//Add 
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(10);
	
	System.out.println(list);
	System.out.println(list.get(0));
	list.remove(0);
	System.out.println(list);
	System.out.println(list.size());
	
	for(int i=0;i<list.size();i++) {
	
	System.out.println(list.get(i));}
	
	ArrayList<String> list2 = new ArrayList<String>();
	
	list2.add("Ram");
	list2.add("Ram");
	System.out.println(list2);
	
	list2.set(1, "Pineapple");
	System.out.println(list2);
	System.out.println(list2.size());
	
	System.out.println(list2.contains("Pineapple"));
	


	System.out.println(list);
	
	Collections.sort(list);
	
	
	ArrayList ob=new ArrayList();
	ob.addAll(list);
	
	System.out.println(ob);
	
	for (Integer n : list) {
	    System.out.println("Number: " + n);
	}
	
	for (String name : list2) {
	    System.out.println("Fruit/Name: " + name);
	}
	
	for (Object item : ob) {
	    System.out.println("Item in OB: " + item);
	}
	
	}

}
