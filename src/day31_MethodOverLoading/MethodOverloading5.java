package day31_MethodOverLoading;

import java.util.Arrays;

public class MethodOverloading5 {
    public static void main(String[] args) {

        double[] arr1 = {1.5, 2.5, 3.5};
        double[] arr2 = {4.5, 5.5, 6.5, 7.5};
        double[] arr3 = {8.5, 9.5};
        double[] arr4 = {10.5, 12.5, 11.5};

        double[] arr5 = combineTwoArrays(combineTwoArrays(arr1, arr2), combineTwoArrays(arr1, arr2));
        // combineTwo arrays ( new array, new array)
        // new array

        System.out.println(Arrays.toString(arr5));
        System.out.println("==========================================");

        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {6, 7, 8, 9};
        int[] a3 = {10, 11};


        int[] a4 = combineTwoArrays(combineTwoArrays(a1, a2), a3);
        System.out.println(Arrays.toString(a4));
        System.out.println("===========================================");

        String[] group1 = {"Serdar","Merdan","Kowus"};
        String[] group2 = {"Kisi","Plany","Yeri"};
        String[] group3 = {"Lol","Law","Peack"};
        String[] group4 = {"Lowdawla","Lawaawaw","Peawdawdack"};

        /*
        String[] group1and2 =  combineTwoArrays(group1,group2);
        String[] group3and4 = combineTwoArrays(group3,group4);

        String[] cybertek = combineTwoArrays(group1and2,group3and4);
        System.out.println(Arrays.toString(cybertek));
        */

        String[] cybertek = combineTwoArrays(combineTwoArrays(group1,group2),combineTwoArrays(group3,group4)  );

        System.out.println(Arrays.toString(cybertek));












    }


    public static int[] combineTwoArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;

        for (int each : arr1) {
            arr3[i++] = each;
        }

        for (int each : arr2) {
            arr3[i++] = each;
        }

        return arr3;
    }


    public static double[] combineTwoArrays(double[] arr1, double[] arr2) {
        double[] arr3 = new double[arr1.length + arr2.length];
        int i = 0;

        for (double each : arr1) {
            arr3[i++] = each;
        }

        for (double each : arr2) {
            arr3[i++] = each;
        }

        return arr3;
    }

    public static String[] combineTwoArrays(String[] arr1, String[] arr2) {
        String[] arr3 = new String[arr1.length + arr2.length];
        int i = 0;

        for (String each : arr1) {
            arr3[i++] = each;
        }

        for (String each : arr2) {
            arr3[i++] = each;
        }

        return arr3;
    }



}
