package com.collectionprogram;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {


        Map<Integer,String> map = new HashMap<>();

        map.put(101,"Java");
        map.put(102,"SQL");
        map.put(103,"Python");

        System.out.println(map);

	}

}
