package day18_Strings;

import java.util.Scanner;

// substring : grates the substring of the string object, returns you the new string..
public class StringSubstring {
    public static void main(String[] args) {

        String str = "Today is monday";
        // `          0123456789  ~ 14 ;
        String day = str.substring(9,14+1);
        System.out.println(day);
        System.out.println("=================================");

        String email = "cybertek@gmail.com";
        //              0123456789
        String domain = email.substring(9,13+1);
        System.out.println("Domaint of the email "+email+" is: "+domain);
        System.out.println("==========================================");
        String s1 = "I like movies and books";
        //           01234567
        String word1 = s1.substring(7,13);
        System.out.println(word1);
        System.out.println("==========================");  // ex; incorrect user name with upper & low cases
        String firsName = "cYBERTEK"; // Marwan;
        String firstChar=firsName.substring(0,1).toUpperCase();
        String rest = firsName.substring(1,firsName.length()-1+1).toLowerCase();


        System.out.println(firstChar);
        System.out.println(rest);
        firsName=firstChar+rest;
        System.out.println(firsName);
        System.out.println("================================");





    }
}
