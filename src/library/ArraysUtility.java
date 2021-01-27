
package library;

import java.util.Arrays;

public class ArraysUtility {
    /*
    returns the maximum number from an array of integer
     */
    public static int max(int[] arr){
        int max =arr[0];
        for( int each  : arr ){
            if(each > max){
                max = each;
            }
        }
        return max;
    }


    /*
    returns the minimum number from an array of integer
     */
    public static int min(int[] arr){
        int min = arr[0];

        for(int each : arr) {
            if (each < min) {
                min = each;
            }
        }

        return min;
    }


    /*
    Combines two arrays of integers and return the new array
     */
    public static int[] combineTwoArrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length+arr2.length];
        int i = 0;

        for(int each : arr1){
            arr3[i++] = each;
        }

        for(int each : arr2){
            arr3[i++]  = each;
        }

        return arr3;
    }

    public static char[] combineTwoArrays(char[] arr1, char[] arr2){
        char[] arr3 = new char[arr1.length+arr2.length];
        int i = 0;

        for(char each : arr1){
            arr3[i++] = each;
        }

        for(char each : arr2){
            arr3[i++]  = each;
        }

        return arr3;
    }

    public static String[] combineTwoArrays(String[] arr1, String[] arr2){
        String[] arr3 = new String[arr1.length+arr2.length];
        int i = 0;

        for(String each : arr1){
            arr3[i++] = each;
        }

        for(String each : arr2){
            arr3[i++]  = each;
        }

        return arr3;
    }


    /*
     sorts the array of integers in descending order, and returns it as an array
     */

    public static int[] sort(int[] arr){  // {2,1,3}
        Arrays.sort(arr);  // {1,2,3};
        int[] reversedArray = new int[arr.length];  // {3, 2, 1}

        for(int i=arr.length-1, j = 0 ;  i>=0; i--, j++){
            reversedArray[j] = arr[i];
        }

        return reversedArray;
    }


    /*
     sorts the array of doubles in descending order, and returns it as an array
     */
    public static double[] sort(double[] arr){  // {2,1,3}
        Arrays.sort(arr);  // {1,2,3};
        double[] reversedArray = new double[arr.length];  // {3, 2, 1}

        for(int i=arr.length-1, j = 0 ;  i>=0; i--, j++){
            reversedArray[j] = arr[i];
        }

        return reversedArray;
    }

    /*
     sorts the array of chars in descending order, and returns it as an array
     */
    public static char[] sort(char[] arr){  // {2,1,3}
        Arrays.sort(arr);  // {1,2,3};
        char[] reversedArray = new char[arr.length];  // {3, 2, 1}

        for(int i=arr.length-1, j = 0 ;  i>=0; i--, j++){
            reversedArray[j] = arr[i];
        }

        return reversedArray;
    }

    /*
     sorts the array of Strings in descending order, and returns it as an array
     */
    public static String[] sort(String[] arr){
        Arrays.sort(arr);  // {1,2,3};
        String[] reversedArray = new String[arr.length];  // {3, 2, 1}

        for(int i=arr.length-1, j = 0 ;  i>=0; i--, j++){
            reversedArray[j] = arr[i];
        }

        return reversedArray;
    }




    /*
    replaces the [] with {}  while printing the array
     */
    public static String printArray(int[] arr){
        String str = Arrays.toString(arr);
        str = str.replace("[", "{").replace("]", "}");
        return str;
    }



    /*
    {1,2,3}, 4
    {1,2,3,4}
     */
// this is for arrays of double date type ... short cut
    public static double max(double[] arr){
        double max =arr[0];
        for( double each  : arr ){
            if(each > max){
                max = each;
            }
        }
        return max;
    }


    // to find double min  numbers ....
    public static double min(double[] arr) {
        double min = arr[0];

        for (double each : arr) {
            if (each < min) {
                min = each;
            }
        }

        return min;
    }


    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];
        for (int i = 0; i <= array.length - 1; i++) {
            result[i] = array[i];
        }
        result[result.length - 1] = element;
        return result;
    }

    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];
        for (int i = 0; i <= array.length - 1; i++) {
            result[i] = array[i];
        }
        result[result.length - 1] = element;
        return result;
    }

    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];
        for (int i = 0; i <= array.length - 1; i++) {
            result[i] = array[i];
        }
        result[result.length - 1] = element;
        return result;
    }

    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];
        for (int i = 0; i <= array.length - 1; i++) {
            result[i] = array[i];
        }
        result[result.length - 1] = element;
        return result;
    }



}
