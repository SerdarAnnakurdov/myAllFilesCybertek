package day15_Scanner;

import java.util.Scanner;

//import groupPractice.ableToVote;
// if we wanted use the able to vote from groupPractice class , we import
public class Scanner_IntModule {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //scanner object called scanner
        System.out.println("Enter number one:");

        int numOne = scanner.nextInt();// reading an int number
        System.out.println("Enter number two:");

        int numTwo = scanner.nextShort();//reading an int number
        System.out.println("Number one is: " + numOne);
        System.out.println("Number two is: " + numTwo);
        System.out.println("Sum " + (numOne + numTwo));



    }
}
