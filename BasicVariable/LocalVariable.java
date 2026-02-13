package com.BasicVariable;



	class LocalVariable {

	    void showAge() {
	        int age = 25; 
	        System.out.println("Age: " + age);
	    }

	    public static void main(String[] args) {
	    	LocalVariable p = new LocalVariable();
	        p.showAge();
	    }
	}