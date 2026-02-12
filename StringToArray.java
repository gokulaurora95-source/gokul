package com.String;



public class StringToArray {
    public static void main(String[] args) {
        String input = "hello";
        
  
        char[] chars = input.toCharArray();
        
       
        for (char ch : chars) {
            System.out.print(ch + " ");
        }
    }
}
