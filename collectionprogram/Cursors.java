package com.collectionprogram;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class Cursors {

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
		
		Vector<Integer> v = new Vector<>();

        v.add(10);
        v.add(20);
        v.add(30);

        Enumeration e = v.elements();

        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }

	}

}
