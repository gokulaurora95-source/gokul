package com.Datatypes;

public class PrimitiveDatatype {

	public static void main(String[] args) {
		byte b=10;
		  short s=200;
		  int i=5000;
		  long l=100000L;
		  float f=5.5f;
		  double d=10.25;
		  char c='A';
		  boolean bool=true;

		  System.out.println(b+" "+s+" "+i+" "+l+" "+f+" "+d+" "+c+" "+bool);
		  
		 
		  char ch='A';
		  System.out.println((int)ch);
		  

		  double d1=10.75;
		  int i1=(int)d;
		  System.out.println(i1);
		  
	
		  int x=5;
		  double y=x;
		  System.out.println(y);
		  
		  System.out.println(Byte.SIZE/8);
		  System.out.println(Integer.SIZE/8);
		  
		  
		  long l2=130;
		  byte b2=(byte)l;
		  System.out.println(b2);
		  
		  char ch1='B';
		  System.out.println((int)ch1);
		  
		  int x1=65;
		  char ch2=(char)x1;
		  System.out.println(ch2);
		  
		  double d3=10.123456789;
		  float f3=(float)d3;
		  System.out.println(f3);
		  
		  int x5=-65;
		  char c5=(char)x5;
		  System.out.println(c5);
		  
		  byte a6=10;
		  byte b6=20;
		  int c6=a6+b6;
		  System.out.println(c6);
		  
		  
		  char ch8='A';
		  System.out.println(ch8+1);
		  
		  
		  int a9=5;
		  double b9=2;
		  System.out.println(a9/b);
		  
		  float f7=10/3;
		  System.out.println(f7);
		  
		  System.out.println(10+20+"Java");
		  System.out.println('A'+'B');
		  System.out.println(5+5+"5"+5+5);
		  
		  
		  int n=4;
		  boolean even=(n%2==0);
		  System.out.println(even);
		  
		  
		  char c10='A';
		  System.out.println(c10>='A' && c10<='Z');
		  int n1=65;
		  System.out.println(n1>=32 && n1<=126);
		  
		  int n2=120;
		  System.out.println(n2>=-128 && n2<=127);
		  
		  char c9='A';
		  System.out.println(c9>='A' && c9<='Z');
		  
		  
		  System.out.println(1.0/0);
		  System.out.println(1/0);
	}

}
