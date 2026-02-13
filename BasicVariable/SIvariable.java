package com.BasicVariable;


	class SIvariable {

	    static String company = "TCS";  
	    String name = "Ravi";           

	    void display() {
	        System.out.println("Company: " + company);
	        System.out.println("Name: " + name);
	    }

	    public static void main(String[] args) {
	    	SIvariable e = new SIvariable();
	        e.display();
	    }
	}
