package Office_Hours.Practice_11_04_2020;

import java.util.Scanner;

public class UniqueAndDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your string:");
        String str = scan.next(); // unique chars -- >> "bd";

        String unique = "";
        String duplicated = "";

        for (int j = 0; j < str.length(); j++) { // for finding freq of the char over times till end of the length ..

            char ch = str.charAt(j);
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) { // for finding the freq of the one char at a time
                if (str.charAt(i) == ch) {
                    frequency++;
                }
            }

            if (frequency == 1) { // if frequency is one it means that character is unique
                unique += ch;

            }
            if (frequency > 1) {// if frequency is more than 1 , it means it duplicated
                duplicated += ch;  //  && !duplicated.contains(""+ch) --> in order to contain one char
            }


        }
        System.out.println(unique);
        System.out.println(duplicated);


    }
}
