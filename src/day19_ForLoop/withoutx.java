package day19_ForLoop;

import java.util.Scanner;

public class withoutx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        if (word.toLowerCase().startsWith("x")) {
            System.out.println(word.substring(1));
        } else {
            System.out.println(word);
        }
        System.out.println("====================================");

        char firstChar = word.charAt(0);
        if(firstChar == 'X' ||firstChar == 'x' ){
            System.out.println(word.substring(1));
        }else{
            System.out.println(word);
        }
        System.out.println("======================================");






    }
}
