package com.String;



public class OnlyDigitsRegex {
    public static void main(String[] args) {
        String input = "12345";

     
        if (input.matches("\\d+")) {
            System.out.println("Only Digits");
        } else {
            System.out.println("Not Only Digits");
        }
    }
}
