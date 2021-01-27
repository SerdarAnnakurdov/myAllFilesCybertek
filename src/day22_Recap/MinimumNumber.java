package day22_Recap;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        /*
        Scanner object : 1 
        min : 1 
        
        
       "Enter a num: 5 
       scan.nextInt() : 5 
       comparing : 5 
       
         */

        Scanner scan = new Scanner(System.in);

        int min = 999999999; // enter likely enters number smaller than 999999999

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a number:");
            int num = scan.nextInt();

            if (num < min) {
                min = num;
            }
        }
        System.out.println("min = " + min);


    }
}
