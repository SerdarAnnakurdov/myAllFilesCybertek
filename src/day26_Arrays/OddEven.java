package day26_Arrays;

import java.util.Arrays;

public class OddEven {
    public static void main(String[] args) {

        int[] numbers = new int[100];
        // last index is : 99

        for (int i = 0; i <= 99; i++) {     //i : 0~99
            numbers[i] = i + 1;
            /*
            numbers[0] = 1;
            numbers[1] = 2;
            numbers[2] = 3;
             */

        }
        System.out.println(Arrays.toString(numbers));
        /*
        1.How many even numbers in the array ?
        2.How many odd numbers in the array ?
        3.How many numbers evenly divisible by 3 ?
        4.How many numbers evenly divisible by 5 ?
         */

        int countEven = 0;
        int countOdd = 0;
        int count3 = 0;
        int count5 = 0;


        for (int i = 0; i <= numbers.length - 1; i++) {
            int eachNumber = numbers[i]; // 
            if (eachNumber % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
            if (eachNumber % 3 == 0) {
                count3++;
            }
            if (eachNumber % 5 == 0) {
                count5++;
            }
        }

        System.out.println("Even numbers = " + countEven);
        System.out.println("Odd numbers = " + countOdd);
        System.out.println("Evenly divisible by 3 = " + count3);
        System.out.println("Evenly divisible by 5 = " + count5);

    }
}
