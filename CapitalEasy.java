package com.String;

public class CapitalEasy {
	public static void main(String[] args) {
		String input = "java programming language";
		String result = "";


		for (String word : input.split(" ")) {


			result += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
		}

		System.out.println(result.trim());
	}
}