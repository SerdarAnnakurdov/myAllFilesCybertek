package day26_Arrays;

import java.util.Arrays;

public class ArrayUtility {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);


        // Arrays.toString(array) ; converts the array to the String
        System.out.println(numbers);// [I@6e0be858 --->>> hashcode meaning of it ..

        System.out.println(Arrays.toString(numbers));

        String[] classMates = {"Serdar", "Yasin", "Feride"};

        System.out.println(Arrays.toString(classMates));


        // sort method  Array.sort(array) : sorts the array in ascending order
        // int[] arr = {9, 4, 2, 1, 10, 11, 0}  ---->> {0,1,2,4,9,10,11} sorts to second kind

        int[] arr = {12121, 32324, 45656, 13425, 5767778, 9895, 563543};

        Arrays.sort(arr); // doesnt return any value , cannot be assighned to a variable or pass it in print ..

        System.out.println(Arrays.toString(arr));
        System.out.println("Max: " + arr[arr.length - 1]);
        System.out.println("Min: " + arr[0]);

        double[] arr2 = {1.5, 0.5, 2.5, 0, 3.5, 1.8, 10.5, 20.5, -0.75, -0.5};

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        System.out.println("Second min number: " + arr2[1]);
        System.out.println("Second max number: " + arr2[arr2.length - 1 - 1]);


        //write the program that can sort an array of integers in descending
        // int[] arr = {5.1.2.6.7.0}   output : 7,6,5,2,1,0

        String[] names = {"Serdar", "Alan", "Kaka", "cristiano", "Myrtaly", "Dean"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));


        int[] arr1 = {5, 1, 2, 6, 7, 0};

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        for (int i = arr1.length; i > 0; i--) {
            System.out.print(i + " ");

        }
        System.out.println();
        // equal (arr1, arr2

        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 3, 2};

        Arrays.sort(a1);//1,2,3
        Arrays.sort(a2);//1,2,3

        boolean r1 = Arrays.equals(a1, a2);
        System.out.println(r1);


    }


}
