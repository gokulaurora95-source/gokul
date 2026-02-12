package com.String;


public class RemoveSpace {
    public static void main(String[] args) {
        String input = "Java is fun";
        
      
        String output = input.replaceAll("\\s","");
        
        System.out.println(output);
    }
}
