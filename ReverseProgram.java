package com.String;

public class ReverseProgram {

	public static void main(String[] args) {
		String input="Hello";
		
//		String output=new StringBuilder(input).reverse().toString();
//		
//		System.out.println(output);
		
		
		String reversed=" ";
		
		for(int i=input.length()-1;i>=0;i--) {
			
			reversed=reversed + input.charAt(i) ;
			
		}
		System.out.println(reversed);

	}

}
