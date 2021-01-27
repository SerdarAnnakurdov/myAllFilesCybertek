package day26_Arrays;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "abcde";

        char[] array = str.toCharArray();
        System.out.println(Arrays.toString(array));

        System.out.println("======================");
        // anagram task:
        String s1 = "acb"; //a,c,b
        String s2 = "acB"; // b,a,c

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean isAnagram = Arrays.equals(ch1,ch2);
        System.out.println(isAnagram);


        System.out.println("============================");
        // split(str.Value0 returns String array , splits the string by given value
        // str = "Today is great day"
        // str.split(" "); -->> i split them by space {"Today","is","great","day"}

        String sentence = "Today is great day";
        String[] words = sentence.split(" ");

        String reverse = "";

        System.out.println(Arrays.toString(words));











    }
}
