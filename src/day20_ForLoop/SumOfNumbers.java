package day20_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = scan.nextInt();
        scan.close();


        int result = 0;

        if(num >= 1 ){
            for(int i = 1; i<=num;i++){ // used for calculating the sum and add them into result
                result+=i;

        }

        }else{
            System.err.println("Invalid entry");
        }

        System.out.println("result = " + result);
        
        
        
    }
}
