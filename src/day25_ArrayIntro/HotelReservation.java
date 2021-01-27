package day25_ArrayIntro;

import java.util.Scanner;

public class HotelReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;

        while (true){
        System.out.println("Which room whould you like to select?");
        System.out.println("\tKing bed = $120 \n\tQueen bed = $100\n\tSingle bed = $80");

        String word = scan.nextLine().toLowerCase();

        while ( !(word.equals("king bed") || word.equals("queen bed") || word.equals("single bed")) ){
            System.out.println("Invalid Entry please Re-Enter");
            word = scan.nextLine().toLowerCase();
        } // to make sure user selected either king bed or queen bed or single bed

        total += (word.equals("king bed"))? 120 :(word.equals("queen bed"))? 100 : 80;


            System.out.println("would you like to select another room? ");
            String a = scan.nextLine().toLowerCase();

            while(!(a.equals("yes")||a.equals("no"))){ // while the answer is not valid answer
                System.out.println("Invalid Entry, please re-entry");
                System.out.println("Would you like to select another room");
                a = scan.nextLine().toLowerCase();


            } // it stops when answer yes or no ...

            if(a.equals("no")){
                System.out.println("Your total price: $ "+total);
                break;
            }

    }
}}
/*
A. king bed = 120$
B. queen bed = 100$
C. single bed = 80$
 */