package day25_ArrayIntro;

import java.util.Scanner;

public class NameOfTheDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        System.out.println("Enter a number:");
        int number = scan.nextInt();

        System.out.println(days[number-1]);






    }

}
