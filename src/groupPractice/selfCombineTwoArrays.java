package groupPractice;

import java.util.Arrays;

public class selfCombineTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,9,8,7};
        int[] arr2 = {12,4,5,10,11,6};

        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        for(int each:arr1){
            arr3[i++] = each;
        }
        for(int each: arr2){
            arr3[i++] = each;
        }
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));









    }
}
