package day24_NestedLoop;

import java.util.Scanner;

public class RoomReserveBeds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalPrice = 0;

        System.out.println("do you want to reserve a room?");
        String yesOrNo = scan.next();

        while (yesOrNo.equalsIgnoreCase("yes")) {

            System.out.println("Which bed type do you want?");
            String bedType = scan.next().toLowerCase();

            switch (bedType) {
                case "king":
                    System.out.println("King size selected");
                    totalPrice += 120;
                    break;

                case "queen":
                    System.out.println("queen size selected");
                    totalPrice += 100;
                    break;

                case "single":
                    System.out.println("single size selected");
                    totalPrice += 80;
                    break;
                default:
                    System.out.println("Invalid room type");
            }

            System.out.println("total price "+"$"+totalPrice);



        }



    }


}
/*
2. write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
            the program asks the user which bedroom does he/she wants to reserve and calculats the total price, and then the program will ask:
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            while answer is neither yes or no ==> please re-enter
            HINT: nested loop task, outter loop need to be an infinite loop
 */