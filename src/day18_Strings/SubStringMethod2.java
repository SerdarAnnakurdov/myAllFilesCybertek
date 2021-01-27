package day18_Strings;

import java.util.Scanner;

public class SubStringMethod2 {
    public static void main(String[] args) {
        String str = "Today is Monday";
                    //0123456789
        String day = str.substring(0);
        System.out.println(day);
        System.out.println("============================");

        Scanner scan = new Scanner(System.in);

        System.out.println("First name: ");
        String firsName= scan.nextLine();
        System.out.println("Last name: ");
        String lastName = scan.nextLine();

        firsName = firsName.substring(0,1).toUpperCase() + firsName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        String fullName = firsName+" "+lastName;

        System.out.println("Your full name is: "+fullName);






    }
}
