package com.String;

public class CompareStrings {
    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "banana";

        int result = s1.compareTo(s2);

        if (result < 0) {
            System.out.println(s1 + " < " + s2); 
        } else if (result > 0) {
            System.out.println(s1 + " > " + s2); 
        } else {
            System.out.println("Both are equal");
        }
    }
}