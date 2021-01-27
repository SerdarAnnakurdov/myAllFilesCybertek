package day22_Recap;

import java.util.Scanner; // your initial S.A Serdar . Annakurdov

public class StringPractice2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name:");
        String f = scan.nextLine();

        System.out.println("Enter last name: ");
        String l = scan.nextLine();

        String initial = f.substring(0, 1).toUpperCase() +"."+ l.substring(0, 1).toUpperCase();

        System.out.println("initial = " + initial);
    }
}
