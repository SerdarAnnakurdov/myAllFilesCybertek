package day19_ForLoop;

import java.util.Scanner;

public class CombineTwoStrings {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String s1 = input.nextLine();
        String s2 = input.nextLine();
        input.close();

        if(s1.charAt(s1.length()-1)==s2.charAt(0)){ // if last character of first equal to second ..
            System.out.println(s1+s2.substring(1));
        }else{
            System.out.println(s1+s2);
        }
        System.out.println("===================================");

        if(s1.endsWith(s2.substring(0,1)   )){
            System.out.println(s1 +s2.substring(1));
        }else{
            System.out.println(s1+s2);
        }
        System.out.println("===============================");
        if(s1.endsWith(""+s2.charAt(0) )){  // if first string ends with the firs character ..

        }else{
            System.out.println(s1+s2);
        }



    }
}
