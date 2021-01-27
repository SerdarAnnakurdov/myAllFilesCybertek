package day28_MultiDimensionalArray;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6};
        int[] c = {7, 8, 9};
        int[] d = {10, 11, 12,};
        int[] e = {13, 14, 15};

        int[][] arr2D = {{1, 2, -3, 4}, {5, 6}, {700, 8, 9}, {10, 11, 12}, {13, 14, 15,19}};
        //                    0           1        2        3        4

        int max = arr2D[0][0];
        int min = arr2D[0][0];


        for (int i = 0; i < arr2D.length; i++) { // i : index number of single dimensional array 
            int[] arr1D = arr2D[i];
            for (int j = 0; j < arr1D.length; j++) {// j : index numbers of the elements of each dimensional element 
                int eachElement = arr1D[j];
                if (eachElement > max) {
                    max = eachElement;
                }
                if(eachElement<min){
                    min = eachElement;
                }

            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }
}
