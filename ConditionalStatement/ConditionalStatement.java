package com.ConditionalStatement;

public class ConditionalStatement {

	public static void main(String[] args) {
		int n = -5;

		if(n > 0)
		    System.out.println("Positive");
		else if(n < 0)
		    System.out.println("Negative");
		else
		    System.out.println("Zero");
		
		int n1 = 7;

		if(n1 % 2 == 0)
		    System.out.println("Even");
		else
		    System.out.println("Odd");
		
		int a = 10, b = 20;

		if(a > b)
		    System.out.println("a is greater");
		else
		    System.out.println("b is greater");
		
		int a1=5,b1=9,c=7;

		if(a1>b1 && a1>c)
		    System.out.println("a1 greatest");
		else if(b1>a1 && b1>c)
		    System.out.println("b1 greatest");
		else
		    System.out.println("c greatest");
		
		char ch = 'a';

		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
		   ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		    System.out.println("Vowel");
		else
		    System.out.println("Consonant");
		
		int n2 = 15;

		if(n2%3==0 && n2%5==0)
		    System.out.println("Divisible by both");
		else
		    System.out.println("Not divisible");
		
		int n3 = 8;

		if(n3>0){
		    System.out.println("Positive");

		    if(n3%2==0)
		        System.out.println("Even");
		    else
		        System.out.println("Odd");
		}
		else{
		    System.out.println("Not positive");}
		    
		    int marks = 78;

		    if(marks>=90)
		        System.out.println("Grade A");
		    else if(marks>=75)
		        System.out.println("Grade B");
		    else if(marks>=60)
		        System.out.println("Grade C");
		    else if(marks>=50)
		        System.out.println("Grade D");
		    else
		        System.out.println("Fail");
		    
		    int age = 65;

		    if(age >= 18){
		        System.out.println("Eligible to vote");

		        if(age >= 60)
		            System.out.println("Senior Citizen");
		        else
		            System.out.println("Not Senior Citizen");
		    }
		    else{
		        System.out.println("Not eligible to vote");
		    }
		    int year = 2024;

		    if((year%4==0 && year%100!=0) || year%400==0)
		        System.out.println("Leap Year");
		    else
		        System.out.println("Not Leap Year");

		}

	}


