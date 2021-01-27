package day18_Strings;

import java.util.Scanner;

public class SubStringMethod {
    public static void main(String[] args) {
        // task : ask the user enter the firs and last name then print full name
        // input : cYBERTEK - sCHOOL .. -->> output : Cybertek School..
        Scanner  scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String f = scan.nextLine();

        f = f.substring(0,1).toUpperCase()  +  f.substring(1, f.length()-1 +1 ).toLowerCase() ;

        System.out.println("Enter your last name: ");
        String l = scan.nextLine();

        l =  l.substring(0, 1).toUpperCase() + l.substring(1, l.length()).toLowerCase();

        System.out.println("first name is: "+f);
        System.out.println("last name is: "+l);

        String fullName = f + " " + l;

        System.out.println("full name is: "+fullName);
    }
}
