package com.collectionprogram;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("Java");
		list.add("SQL");
		list.add("Python");

		Iterator<String> itr = list.iterator();

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
