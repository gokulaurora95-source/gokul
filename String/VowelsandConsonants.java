package com.String;

public class VowelsandConsonants {

    public static void main(String[] args) {
        String input = "Hello World";
        int vowels = 0;
        int consonants = 0;
         
        String Str = input.toLowerCase();
        
     
        for(int i = 0; i < Str.length(); i++) {
            
            char ch = Str.charAt(i);
            
           
            if(ch >= 'a' && ch <= 'z') {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}