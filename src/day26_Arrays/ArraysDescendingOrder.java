package day26_Arrays;

import java.util.Arrays;

public class ArraysDescendingOrder {
    public static void main(String[] args) {

        int[] arr = {5, 1, 2, 6, 7, 0};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int[] descending = new int[arr.length];
        int j = 0;



        for (int i = arr.length - 1; i >= 0; i--){
            //System.out.print(arr[i]+" ");
            descending[j] = arr[i];
            j++;
        }

        System.out.println(Arrays.toString(descending));








    }
}
