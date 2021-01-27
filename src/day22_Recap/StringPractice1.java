package day22_Recap;

import java.util.Scanner;

public class StringPractice1 {
    public static void main(String[] args) {
        /*
        substring :
            substring (beg,end) creates substring from  beginning index till the ending index(excluded)
            substring (beg):

         */
        String sentence = "My name is cybertek";

        String name1 = sentence.substring(11, sentence.length());
        System.out.println(name1);

        String name2 = sentence.substring(11);
        System.out.println(name2);

        String str1 = "Thursday is cool, it's fun day";

        String day = str1.substring(0, 6);
        System.out.println(day);

        String day2 = str1.substring(0, str1.indexOf(" "));
        System.out.println(day2);

        String s1 = "https://www.google.com";

        String domain = s1.substring(s1.lastIndexOf(".") + 1);
        System.out.println(domain);

        String name = s1.substring(s1.indexOf("w.") + 2, s1.lastIndexOf("."));
        System.out.println(name);

        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase(); // Amazon
        System.out.println(name);
        System.out.println("=======================================");
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter firs name:");
        String firstName = scan.nextLine().toLowerCase().replace(" ","");

        System.out.println("Enter last name:");
        String lastName = scan.nextLine().toLowerCase().replace(" ","");

        scan.close();

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);


        String fullName = firstName + " " + lastName;


        System.out.println("fullName = " + fullName);


    }
}
