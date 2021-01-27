package day20_ForLoop;

import java.util.Scanner;

public class SumOfUserEnterNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("Enter a number: ");
        //int n1 = scan.nextInt();

        //System.out.println("Enter a number:");
        //int n2 = scan.nextInt();

        //System.out.println("Enter a number:");
        //int n3 = scan.nextInt();

        //System.out.println("Enter a number:");
        //int n4 = scan.nextInt();

        //System.out.println("Enter a number:");
        //int n5 = scan.nextInt();

        //int result = n1 + n2 + n3 + n4 + n5;
        //System.out.println(result);



        int times = scan.nextInt(); // how many times user wants to enter .. and then concat it to the loop as variable
        int result = 0; // this result adding +1=1 +2 = 3 +3 =6 +4 =10 + 5 = 15
        for(int i = 1; i <= times; i++){ // we allowed  to user decide how many times they would like to enter numbers
            System.out.println("Enter a number: "+i);
            result += scan.nextInt(); // each the result will be added to the result ...

        }
        System.out.println("result = " + result);

        
        
    }
}
