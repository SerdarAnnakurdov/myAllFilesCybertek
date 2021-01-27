package day29_Methods;

import java.util.Scanner;

public class ReverseString {
    // "cybertek" ===>> ketrebyC
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] names = {"Serdar", "Mekan", "Vepa", "Anton", "Grin"};

        for (String eachName : names) {
            reverse(eachName + " ");
        }


        //reverse("Cybertek");
        //System.out.println("Enter your word you want to reverse it");
        //reverse(scan.next());


    }

    public static void reverse(String word) {
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i);

        }
        System.out.println(result);

    }


}
