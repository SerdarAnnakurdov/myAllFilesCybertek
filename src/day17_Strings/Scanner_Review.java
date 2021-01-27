package day17_Strings;
import java.util.Scanner;
public class Scanner_Review {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Pick a number from 1~10: ");
        byte num = input.nextByte(); // accept one byte ..
        if (num > 0 && num < 11) { // makes sure the number is in the range ...


            System.out.println("Can you write it number as a word ");
            String word = input.next(); // accept one word ..
            boolean areMatching = false;
            switch (word) {
                case "one":
                    areMatching = (num == 1);
                    break;
                case "two":
                    areMatching = (num == 2);
                    break;
                case "three":
                    areMatching = (num == 3);
                    break;
                // cases four ~ ten


            }

            if (areMatching) {
                System.out.println("Number: " + num);
                System.out.println("Word: " + word);

            } else {
                System.err.println("The two inputs do not match");
            }


        }
    }
}