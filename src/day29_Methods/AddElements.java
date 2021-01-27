package day29_Methods;

import com.sun.tools.javac.code.Attribute;

import java.util.Arrays;

public class AddElements {
    // write the program to add the elements to each others ...
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};
        addElements(arr, 50);


        int[] arr2 = {1, 2, 4, 5, 6, 7};
        addElements(arr2, 10);


    }


    //                                {1,2,3} ,    4
    public static void addElements(int[] arr, int num) {
        int[] result = new int[arr.length + 1];
        for (int i = 0; i <= arr.length - 1; i++) {
            result[i] = arr[i];

        }
        result[result.length - 1] = num;
        System.out.println(Arrays.toString(result));

    }


}
/*
take home work
arr1 = {1,2,3,4}
arr2 = {5,6,7}
{1,2,3,4,5,6,7 }

 */
