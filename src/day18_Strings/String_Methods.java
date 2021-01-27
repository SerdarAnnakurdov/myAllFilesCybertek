package day18_Strings;

import java.util.Scanner;

public class String_Methods {
    public static void main(String[] args) {
        String str = "Cybertek";
        str=str.concat(" School");
        System.out.println(str);

        String str2 = "Cybertek";           // concats is only for THE STRING not able to concat int or something to string..
        str2=str2+" School";

        System.out.println(str2);

        //toLowercase(); create the lower case version of the sting , returns you new string
        System.out.println("=====================================");
        String name = "bank of america";
        name = name.toUpperCase();
        System.out.println("name = "+name);

        //trim() : removes the spaces that are not used;
        // ex : Today    Is   Great  Day
        String t1 = "           hello     ";   // its will keeping spacec between the words other spaces will be removed
        t1.trim();
        t1=t1.trim();
        System.out.println(t1);

        String t2 = "Hello Everyone";
        t2 = t2.trim();
        System.out.println(t2);
        System.out.println("==================================");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your firs name: ");
        String firstName = scan.nextLine();
        firstName=firstName.trim();

        System.out.println("Enter your last name:");
        String lastName = scan.nextLine();
        lastName=lastName.trim();
        scan.nextLine();

        System.out.println("Your last name is: "+lastName);
        System.out.println("First name is: "+firstName);







    }
}
