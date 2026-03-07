package com.collectionprogram;

import java.util.LinkedList;

public class LinkedListExample {

	    public static void main(String[] args) {

	        LinkedList<String> list = new LinkedList<>();

	        list.add("A");
	        list.add("B");
	        list.add("C");

	        list.addFirst("Start");
	        list.addLast("End");

	        list.remove("B");

	        for(String s : list)
	        {
	            System.out.println(s);
	        }
	        
	        LinkedList<String> playlist = new LinkedList<>();

	        playlist.add("Song1");
	        playlist.add("Song2");
	        playlist.add("Song3");

	        playlist.remove("Song2");

	        System.out.println(playlist);

	    }
	}

