package com.BasicVariable;

class InstanceVariable {
	String name = "Gokul";   

	void display() {
		System.out.println("Name: " + name);
	}

	public static void main(String[] args) {
		InstanceVariable s = new InstanceVariable(); 
		s.display();
	}
}