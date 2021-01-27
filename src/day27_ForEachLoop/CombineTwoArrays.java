package day27_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CombineTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {10,20,30,40,50,60,70,80,90,};
        int[] arr2 = {-1,-2,-3,-4,-5,-6,-7,-8,-9};

        int[] arr3 = new int[arr1.length + arr2.length]; // the array must have the capacity tp contain first and third array
        int j = 0;

        for(int each : arr1 ){
            arr3[j++] = each;
/*
arr3[0] = 1
arr3[1] = 2
arr3[2] = 3
arr3[3] = 4
 */
        }
        for(int each: arr2){
            arr3[j++] = each;
            /*
            arr3[0] = 1
            arr3[0] = 1
            arr3[0] = 1
             */
        }
        System.out.println(Arrays.toString(arr3));






    }
}
