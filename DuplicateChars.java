package com.String;
public class DuplicateChars {
    public static void main(String[] args) {
        String input = "programming";
        
        char[] str = input.toCharArray();

        System.out.println("Duplicate characters in: " + input);

        for (int i = 0; i < str.length; i++) {
            int count = 1;
            
         
            if (str[i] == 'X') {
                continue;
            }

            
            for (int j = i + 1; j < str.length; j++) {
                if (str[i] == str[j]) {
                    count++;      
                    str[j] = 'X'; 
                }
            }

            if (count > 1) {
                System.out.println(str[i] + ": " + count);
            }
        }
    }
}