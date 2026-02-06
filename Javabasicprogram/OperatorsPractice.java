package com.Javabasicprogram;

public class OperatorsPractice {
	

	public static void main(String[] args) {
		System.out.println(10 + 20 * 3);
		
		int a = 10;
		System.out.println(a++);
		
		int a1 = 10;
		System.out.println(++a1);
		
		System.out.println(10 / 3);
		
		System.out.println(10 % 3);
		
		int a2 = 5;
		int b = 10;
		System.out.println(a2 > b && ++a2 > 5);
		
		int a3 = 5;
		System.out.println(a3++ + a3++);
		
		int a4 = 10;
		int b2 = 5;
		System.out.println(a4 > b2 || ++b2 > 10);
		
		System.out.println(10 + 20 + "Zoho");
		
		System.out.println("Zoho" + 10 + 20);
		
		System.out.println(10 + 20 + "Zoho" + 30 + 40);
		
		int a5 = 5;
		a5 += a5++ + ++a5;
		System.out.println(a5);
		
		int a6 = 10;
		System.out.println(a6++ + a6++ + ++a6);
		
		int a7 = 10;
		System.out.println(a7++ + ++a7 + a7++);
		
		int a8 = 5;
		int b3 = 10;
		System.out.println(a8++ > b3 || ++a8 > 6);
		
		int x = 5;
		System.out.println(x++ + x++ * ++x);
		
		int a9 = 5;
		int b4 = 2;
		System.out.println(a9 / b4 * b4 + a9 % b4);
		
		System.out.println(10 == 10.0);
		
		System.out.println('A' + 1);
		System.out.println('A' + 'B');
		System.out.println(true + "Zoho");
		System.out.println(5 & 3);
	}

}
