package com.String;

public class PalindromeNew {

	public static void main(String[] args) {
	String input="madam";
		
		String output=new StringBuilder(input).reverse().toString();
		
		if(input.equals(output)){
			
			System.out.println("It is a Palindrome");
			
		}else {
			System.out.println("it is not a palindrome");
		}

	}

}
