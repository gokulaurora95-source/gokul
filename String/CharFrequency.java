package com.String;



public class CharFrequency {
    public static void main(String[] args) {
        String input = "banana";
        char[] str = input.toCharArray(); 

        System.out.println("Character frequencies in: " + input);

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

           
            System.out.println(str[i] + " - " + count);
        }
    }
}
