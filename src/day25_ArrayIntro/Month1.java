package day25_ArrayIntro;

import java.util.Scanner;

public class Month1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        String[] days = new String[7];

        days[0] = "Monday";
        days[1] = "Tuesday";
        days[2] ="Wednesday";
        days[3] = "Thursday";
        days[4] = "Friday";
        days[5] = "Saturday";
        days[6] = "Sunday";

        System.out.println("Today is: "+days[number-1]);



    }
}
