package day30_ReturnMethods;

import java.util.Arrays;

public class WarmUpTasks {
    public static void main(String[] args) {

        //pasitiveNegativeZero(0);
        //pasitiveNegativeZero(-10);
        //pasitiveNegativeZero(98);

        //int[] numbers = {1, 2, 3, 4, -5, -6, -7, -8, 10, 11, 0};


        /*for(int eachIndex :numbers ){
            pasitiveNegativeZero(eachIndex);
        }*/

        //for (int i = 0; i <= numbers.length - 1; i++) {
        //pasitiveNegativeZero(numbers[i]);

        System.out.println("===========================");

        gradeCalculator(34);
        gradeCalculator(100);
        pasitiveNegativeZero(1);


        int[] a1 = {10, 30, 50, 20, 60, 70};
        int[] a2 = {80, 90, 100, 40};
        combineTwoArrays(a1, a2);

        removeDuplicates("aaaaaaaaaaaaaabbbbbbbbbbcccccccccggggg");

        String str = "wwwwwwpppppoooottttkkkk";
        removeDuplicates(str);


        formattedFullName("serdar","anakurdov");


    }


    // task:1
    public static void pasitiveNegativeZero(int number) {
        String result = "";
        if (number > 0) {
            System.out.println(number + " is pasitive");
        } else if (number < 0) {
            System.out.println(number + " is negative");
        } else {
            System.out.println(number + " is zero");
        }


    }

    //task:2
    public static void gradeCalculator(int score) {
        if (score >= 0 && score <= 100) {
            System.out.println((score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "E");


        } else {
            System.err.println("Invalid Score");
        }

    }

    //task:3
    public static void combineTwoArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0; // represents the index of nums of arr3
        for (int each : arr1) {
            arr3[i++] = each;
        }
        for (int each : arr2) {
            arr3[i++] = each;
        }
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));


    }

    //task:4                                    aabbccbb
    public static void removeDuplicates(String str) {
        String result = ""; //
        for (String each : str.split("")) {
            if (result.contains(each)) {
                continue;
            } else {
                result += each;
            }

        }
        System.out.println(result);


    }

    // task5:                           // "cYbErTeK" ,
    public static void formattedFullName(String first, String last){
        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase() ;     //"Cybertek"
        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase() ;   // School

        String fullName = first + " " + last;

        System.out.println(fullName);
    }


}
/*
Warmup tasks:
    1. create a function that can check if the given integer is positive, negative or zero
    2. create a function that can calculate the garde of the student
    3. create a function that can print out the combination of two integer arrays
    4. create a function that can print a string without the duplicated characters
    5.  write a method that can print out the full name of a person in reugral format
            ex:
               fullName("cYbErTeK", "SCHOOL");
                output:
                    "Cybertek School"

 */