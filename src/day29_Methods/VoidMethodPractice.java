package day29_Methods;

import java.util.Arrays;

/*
AM specifier returnType methodName (Parameter)
 */
public class VoidMethodPractice {
    public static void main(String[] args) {

        int[] a1 = {122, 334, 567, 890, 765, 999};
        arrayMaxNum(a1); // by calling this method you dont have to write that methods again and again


        int[] a2 = {4, 5, 6, 7, 8, 8, 34, 23, 445, 787, 9898, 987788, 676};
        arrayMaxNum(a2);

        int[] a3 = {1, 2, 3, 4, 5, 6, 7};
        arrayMaxNum(a3);

        int[] a4 = {1, 2, 3, 4, 5, 6};
        arrayMinNum(a4);

        int[] a5 = {1,1,2,3,3,4,5,5,5,6,6,6,7};
        arrayUniqueElement(a5);


        int[] a6 = {10,10,8,11,11,11,5};
        arrayUniqueElement(a6);




    }

    public static void arrayMaxNum(int[] arr) { // void in here means no returns to anywhere
        /*Arrays.sort(arr);
        System.out.println("Maximum number: "+arr[arr.length-1]);
         */

        int max = arr[0];
        for (int each : arr) {
            if (each > max) {
                max = each;
            }

        }
        System.out.println("Maximum number is " + max);


    }

    public static void arrayMinNum(int[] arr) {
        int min = arr[0];
        for (int each : arr)
            if (each < min)
                min = each;


        System.out.println("Minimum number is: " + min);


    }

    public static void arrayUniqueElement(int[] arr) {
        for (int each : arr) {
            int count = 0;
            for (int each2 : arr) {
                if (each == each2){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(each+" ");
            }

        }
        System.out.println();
    }




}
