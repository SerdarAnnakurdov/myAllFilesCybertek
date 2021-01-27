package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10));

        numbers.removeIf(p -> Collections.frequency(numbers, p) > 1);

        System.out.println(numbers);


        System.out.println("=================================");

        String str = "AABBNNTYKNNMMYYTTLPO";


        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        list.removeIf(p -> Collections.frequency(list, p) > 1);


        String result = list.toString().replace(", ", "").replace("[", "").replace("]", "").toLowerCase();

        System.out.println(result);

        System.out.println("=========================================");


        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('a', '1', 'b', '2', 'c', 'd', '$', '#', '?', '*'));

        //chars.removeIf(p-> Character.isLetter(p) ||Character.isDigit(p) );
        chars.removeIf(p -> Character.isLetterOrDigit(p));


        System.out.println(chars);


    }

}
/*
        Task :
        1.Write a program that find the unique names from an arraylist of string
        do not use loop

        2.write a program that can remove the digits and letters from an array list of characters
        with no loop
         */