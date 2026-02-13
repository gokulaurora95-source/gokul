package com.BasicVariable;

class VariableShadowing {

    int number = 50; 

    void show() {
        int number = 100; 
        System.out.println("Local: " + number);
        System.out.println("Instance: " + this.number);
    }

    public static void main(String[] args) {
        VariableShadowing d = new VariableShadowing();
        d.show();
    }
}

